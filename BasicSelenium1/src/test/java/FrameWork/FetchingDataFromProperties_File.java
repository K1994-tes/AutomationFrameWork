package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Normal Approach
		// driver.findElement(//By.id("user-name")).sendKeys("standard_user");
	   //	driver.findElement(//By.id("password")).sendKeys("secret_sauce");
	  //	driver.findElement(//By.id("login-button")).click();
FileInputStream fis = new FileInputStream("C:\\Users\\saila\\OneDrive\\Desktop\\PropertiesData1.properties.txt");
//FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData1.properties.txt");
				Properties pro = new Properties();
				pro.load(fis);
				
				String URL = pro.getProperty("url");
				String USERNAME = pro.getProperty("username");
				String PASSWORD = pro.getProperty("password");
				driver.get(URL);
				driver.findElement(By.id("user-name")).sendKeys(USERNAME);
				driver.findElement(By.id("password")).sendKeys(PASSWORD);
				driver.findElement(By.id("login-button")).click();
				
	}
}
