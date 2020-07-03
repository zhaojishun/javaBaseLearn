package cn.zhaojishun.javaBase.扩展.excel处理.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-05-14 10:50
 */
public class Main {

    String path = "D:\\";

    @Test
    public void testWrite03(){
        //1创建工作簿
        Workbook workbook = new HSSFWorkbook();
        //2创建工作表
        Sheet sheet = workbook.createSheet("统计表");
        //3创建行 0是第一行
        Row row0 = sheet.createRow(0);
        //4创建单元格
        Cell cell = row0.createCell(0);
        cell.setCellValue("test01");

        Cell cell1 = row0.createCell(1);
        cell1.setCellValue("test02");



    }
}