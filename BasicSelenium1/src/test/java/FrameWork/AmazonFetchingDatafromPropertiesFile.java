package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFetchingDatafromPropertiesFile
{
public static void main(String[]args) throws Throwable 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\Amazon.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String Url=pro.getProperty("url");
	driver.get(Url);
	String Search =pro.getProperty("search");
	driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys(Search);
}
}
