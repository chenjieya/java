import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
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


    @Test
    public void readExcel03() throws Exception {
        // 流
        FileInputStream fileInputStream = new FileInputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁03.xls");

        Workbook workbook = new HSSFWorkbook(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(0);

        // 获取数值的时候注意类型
        System.out.println(cell.getStringCellValue());  // 观众人数统计

        // 关闭流
        fileInputStream.close();
        workbook.close();
    }


    @Test
    public void readExcel07() throws Exception {
        // 流
        FileInputStream fileInputStream = new FileInputStream("/Users/chenjie/Desktop/home/java/POI/poi/陈杰万岁07.xlsx");

        Workbook workbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(0);

        // 获取数值的时候注意类型
        System.out.println(cell.getStringCellValue());  // 观众人数统计

        // 关闭流
        fileInputStream.close();
        workbook.close();
    }



    @Test
    public void readExcelType() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/Users/chenjie/Desktop/home/java/POI/poi/明细表.xls");

        Workbook workbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row titleRow = sheet.getRow(0);

        // 读取标题
        if (titleRow!=null) {
            int cellCount = titleRow.getPhysicalNumberOfCells();
            for (int i = 0; i < cellCount; i++) {
                Cell cell = titleRow.getCell(i);
                String stringCellValue = cell.getStringCellValue();
                System.out.print(stringCellValue + "|");
            }
            System.out.println();
        }

        // 读取内容
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            if (row != null) {
                int cellCount = row.getPhysicalNumberOfCells();
                // 每一个单元格
                for (int j = 0; j < cellCount; j++) {
                    Cell cell = row.getCell(j);
                    String result = "";

                    System.out.print("【"+(i+1)+","+(j+1)+"】");

                    if (cell != null) {
                        // 判断类型
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.print("[STRING]");
                                result = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                System.out.print("[NUMERIC]");  // 数字（日期、普通数字）

                                // 日期
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    System.out.print("[DATE]");
                                    result = new DateTime(cell.getDateCellValue()).toString("yyyy-MM-dd");
                                } else {
                                    System.out.print("[NUMBER]");
                                    result = String.valueOf(cell.getNumericCellValue());
                                }
                                break;
                            case BLANK:
                                System.out.print("[BLANK]");
                                break;
                            case BOOLEAN:
                                System.out.print("[BOOLEAN]");
                                result = String.valueOf(cell.getBooleanCellValue());
                                break;
                        }
                    }

                    System.out.println(result);
                }

            }

        }


        fileInputStream.close();
        workbook.close();
    }



}
