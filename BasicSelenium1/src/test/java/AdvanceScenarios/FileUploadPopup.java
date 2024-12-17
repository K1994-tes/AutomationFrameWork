package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
public static void main(String[]args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\saila\\OneDrive\\Desktop\\PropertiesData1.properties.txt");
}
}
