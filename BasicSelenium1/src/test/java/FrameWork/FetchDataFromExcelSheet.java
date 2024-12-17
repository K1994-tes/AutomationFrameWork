package FrameWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet 
{
	public static void main(String[]args) throws Throwable
	{
		//step1: set the path of Excel_File
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		//step2: Keep Excel file in ReadMode
		Workbook book = WorkbookFactory.create(fis);
		//step3: getting the control on the Sheet
		Sheet sheet = book.getSheet("Sheet1");
		 //step4: getting the control on row
		Row row = sheet.getRow(3);
		//step5: getting the control on Cell
		Cell cell = row.getCell(2);
		//step6: Fetching data from the cell
		String ExcelData = cell.getStringCellValue();
		
		System.out.println(ExcelData);
}
}
