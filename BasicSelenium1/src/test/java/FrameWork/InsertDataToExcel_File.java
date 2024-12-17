package FrameWork;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class InsertDataToExcel_File 
{
public static void main(String[]args)throws Throwable
{
	//step1: set path of the Excel_File
	FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\TestData1.xlsx");
	
	//step2: Keep Excel File in ReadMode
	Workbook book = WorkbookFactory.create(fis);
	
	//step3: getting the control on the Sheet
	Sheet sheet = book.getSheet("Sheet1");
	
	Row row = sheet.createRow(5);
	
	Cell cell = row.createCell(5);
	
	cell.setCellValue("keerthi");
	
	FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\saila\\\\OneDrive\\\\Desktop\\\\TestData1.xlsx");
	
	book.write(fos);
	book.close();
}
}
