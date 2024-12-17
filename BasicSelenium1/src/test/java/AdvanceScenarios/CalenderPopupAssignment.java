package AdvanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class CalenderPopupAssignment 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys(" Ginger Mumbai Hotel Andheri-East Mumbai Maharastra ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @height='1.6rem']")).click();
		driver.findElement(By.xpath("//div[text()='Check-in']")).click();
	//	String monthName=" August 2024";
	//  String date="13";
	driver.findElement(By.xpath("//span[text()='August 2024']/ancestor::div[@class='dcalendar-newstyles__CalenderMonthContainer-sc-1i003by-2 dHuCDl']/descendant::li/span[text()='13']")).click();
    driver.findElement(By.xpath("//div[text()='Check-out']")).click();
	driver.findElement(By.xpath("//span[text()='August 2024']/ancestor::div[@class='dcalendar-newstyles__CalenderMonthContainer-sc-1i003by-2 dHuCDl']/descendant::span[text()='15']")).click();
	driver.findElement(By.xpath("//span[text()='Guests & Rooms']")).click();
	for(int i=0;i<2;i++)
	{
	driver.findElement(By.xpath("//span[@data-testid='button-room-add']")).click();
	driver.findElement(By.xpath("//span[@data-testid='button-adult-add']")).click();
	}
	for(int i=0; i<3;i++)
	{
	driver.findElement(By.xpath("//span[@data-testid='button-child-add']")).click();
}
	driver.findElement(By.xpath("//h4[text()='Select'][1]")).click();
	driver.findElement(By.xpath("//li[text()='8']")).click();
	driver.findElement(By.xpath("(//h4[text()='Select'])[2]")).click();
	driver.findElement(By.xpath("//li[text()='5']")).click();
	driver.findElement(By.xpath("//h4[text()='Select']")).click();
	driver.findElement(By.xpath("//li[text()='6']")).click();
	driver.findElement(By.xpath("//button[text()='Done']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	Thread.sleep(1000);
}
}
