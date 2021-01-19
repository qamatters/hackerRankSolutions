package practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readExcel {

    public static void main(String[] args) throws IOException {

        FileInputStream Expected_Excel = null;
        FileInputStream Actual_Excel = null;

        Actual_Excel =new FileInputStream(new File("src//main//resources//Financial_Sample_Actual.xlsx"));
        XSSFWorkbook wb=new XSSFWorkbook(Actual_Excel);

        XSSFSheet sheet=wb.getSheetAt(0);

        Row row=sheet.getRow(1);
        Cell cell=row.getCell(2); //getting the cell representing the given column
        String value=cell.getStringCellValue();
        System.out.println(value );




    }
}
