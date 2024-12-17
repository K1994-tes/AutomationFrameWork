package AdvanceScenarios;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingWindows 
{
public static void main(String[]args)
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bluetooth",Keys.ENTER);
	driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
	
	String mainId= driver.getWindowHandle();//win1
	System.out.println(mainId);
	
	Set<String> allIds= driver.getWindowHandles();//win1 and win2
	System.out.println(allIds);
	
	for(String id : allIds)
	{
		if(!mainId.equals(id))
		{
			driver.switchTo().window(id);
		}
	}
	String price = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
	System.out.println(price);
}
}
