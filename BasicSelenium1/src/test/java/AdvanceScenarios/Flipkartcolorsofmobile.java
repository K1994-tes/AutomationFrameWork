package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartcolorsofmobile 
{
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	    driver.findElement(By.xpath("//*[name()='svg' and @width='24']")).click();
	//    driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']")).click();
	    Thread.sleep(2000);
	    List<WebElement>  allSugg =     driver.findElements(By.xpath("//span[text()='Apple iPhone 15 (Green, 128 GB)']/../../../../..//div[@class='WGBwfw']//img[@class='-K87l6']"));
	    for(WebElement ele : allSugg)
	    	{
		System.out.print(ele.getText());
	 
	        }
}
}