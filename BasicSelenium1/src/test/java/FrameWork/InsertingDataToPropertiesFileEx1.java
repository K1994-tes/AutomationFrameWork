package FrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertingDataToPropertiesFileEx1 
{
public static void main(String[]args) throws Throwable
{
	//---------------------Writing data to file------------------------------------------------------
	FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\Propamazon.properties.txt");
	Properties pro = new Properties();
	pro.setProperty("url", "https://www.amazon.in");
	pro.setProperty("search", "reebook");
	FileOutputStream fos = new FileOutputStream("C:\\Users\\saila\\OneDrive\\Desktop\\Propamazon.properties.txt");
	pro.store(fos, "commondata");
	//---------------------Reading data from file----------------------------------------------------
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis1 = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\Propamazon.properties.txt");
	Properties pro1 = new Properties();
	pro1.load(fis1);
	String Url = pro1.getProperty("url");
	driver.get("https://www.amazon.in");
    String Search=pro1.getProperty("search");
    driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys(Search);
	
	
}
}
