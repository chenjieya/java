package controller;

import domain.Car;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.CarService;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Carcontroller {

    @Autowired
    private CarService carService;

    @RequestMapping("importCars")
    @ResponseBody
    public String importCars(MultipartFile file) throws IOException, InvalidFormatException {
        ModelAndView modelAndView = new ModelAndView();

        InputStream inputStream = file.getInputStream(); // 获取到上传过来的文件

        ArrayList<Car> cars = new ArrayList<>(); // 用于存储表格数据

        Workbook workbook = WorkbookFactory.create(inputStream);  // excel对象
        Sheet sheet1 = workbook.getSheet("Sheet1");  // 获取到第一个sheet

        for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
            Car car = new Car();

            // 获取行对象
            Row row = sheet1.getRow(i);

            // 获取到每个单元格对象
            Cell cell = row.getCell(0);
            Cell cell1 = row.getCell(1);
            Cell cell2 = row.getCell(2);

            // 获取到每个单元格的数据
            String cname = cell.getStringCellValue();
            String color = cell1.toString();
            Float price = (float) cell2.getNumericCellValue();

            car.setCname(cname);
            car.setColor(color);
            car.setPrice(price);

            cars.add(car);   // 添加到car集合里面

        }

        // 调用服务层
        carService.addCars(cars);

        modelAndView.setViewName("car.jsp");


        return "import success";
    }

    @RequestMapping("cardList")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();

        List<Car> all = carService.findAll();

        modelAndView.addObject("cars", all);
        modelAndView.setViewName("car.jsp");

        return modelAndView;
    }

}
