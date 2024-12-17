package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlfetchingdatafromproperties 
{
public static void main(String[]args) throws Throwable
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\url.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	driver.get(URL);
	String Search = pro.getProperty("search");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Search);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
