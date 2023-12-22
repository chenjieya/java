import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;


import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteTest {

    @Test
    public void writeExcel03() throws Exception {
        // 创建一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个sheet工作表
        HSSFSheet sheet = workbook.createSheet("陈杰无敌");


        // 创建一行
        HSSFRow row1 = sheet.createRow(0);

        // 创建一列(1,1)
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("观众人数统计");

        // 创建一列(1,2)
        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(66666666);


        // 创建第二行
        Row row2 = sheet.createRow(1);

        // 创建第二列(2,1)
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("当前时间");

        //  创建第二列(2,2)
        Cell cell22 = row2.createCell(1);
        cell22.setCellValue(new DateTime().toString("yyyy-MM-ddHH:mm:ss"));



        // 写入到文件
        // 生成一张表（IO 流）  03版本
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁03.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();

        System.out.println("文件写入成功");

    }


    @Test
    public void writeExcel07() throws Exception {
        // 创建一个工作簿
        Workbook workbook = new XSSFWorkbook();
        // 创建一个sheet工作表
        Sheet sheet = workbook.createSheet("陈杰无敌");


        // 创建一行
        Row row1 = sheet.createRow(0);

        // 创建一列(1,1)
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("观众人数统计");

        // 创建一列(1,2)
        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(66666666);


        // 创建第二行
        Row row2 = sheet.createRow(1);

        // 创建第二列(2,1)
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("当前时间");

        //  创建第二列(2,2)
        Cell cell22 = row2.createCell(1);
        cell22.setCellValue(new DateTime().toString("yyyy-MM-ddHH:mm:ss"));



        // 写入到文件
        // 生成一张表（IO 流）  07版本
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁07.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();

        System.out.println("文件写入成功");

    }


    @Test
    public void writeExcelBigData03() throws Exception {
        long begin = System.currentTimeMillis();
        Workbook workbook = new HSSFWorkbook();

        Sheet sheet1 = workbook.createSheet("sheet1");

        for (int rowNum = 0; rowNum < 65536; rowNum++) {
            Row row = sheet1.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("over");

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁bigData03.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();
        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin) /1000);   // 1.084s

    }

    @Test
    public void writeExcelBigData07() throws Exception {
        long begin = System.currentTimeMillis();
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet1 = workbook.createSheet("sheet1");

        for (int rowNum = 0; rowNum < 65536; rowNum++) {
            Row row = sheet1.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("over");

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁bigData07.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();
        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin) /1000);   // 5.748s

    }


    @Test
    public void writeExcelBigData07pluse() throws Exception {
        long begin = System.currentTimeMillis();
        Workbook workbook = new SXSSFWorkbook();

        Sheet sheet1 = workbook.createSheet("sheet1");

        for (int rowNum = 0; rowNum < 65536; rowNum++) {
            Row row = sheet1.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("over");

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁bigData07pluse.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        // 清除临时文件
        ((SXSSFWorkbook) workbook).dispose();
        workbook.close();
        long end = System.currentTimeMillis();

        System.out.println((double) (end-begin) /1000);   // 2.009s

    }




}
