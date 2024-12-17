package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class makemytrip 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
	//	driver.findElement(By.xpath("//span[text()='From']")).click();
	//	driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='9']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='November']/../..//p[text()='10']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
}
}
