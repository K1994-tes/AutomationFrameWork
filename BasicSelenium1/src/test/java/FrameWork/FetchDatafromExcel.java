package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDatafromExcel 
{
public static void main(String[]args) throws Throwable
{
	FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\TestData.xlsx");
	         Workbook book = WorkbookFactory.create(fis);
	       Sheet sheet=  book.getSheet("Sheet1");
	      Row row = sheet.getRow(3);
	      Cell cell   =  row.getCell(3);
	      String ExcelData= cell.getStringCellValue();
	      System.out.println(ExcelData);
	      
}
}
