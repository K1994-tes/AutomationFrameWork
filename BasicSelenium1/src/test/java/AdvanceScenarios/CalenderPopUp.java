package AdvanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class CalenderPopUp 
{
	@Test
public  void  CalenderPopUp ()  throws Throwable
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	driver.manage().window().maximize();
	
	Actions act= new Actions(driver);
	act.moveByOffset(10, 20).click().perform();
	
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	//case1:
//	driver.findElement(By.xpath("//div[text()='August 2024']/../..//p[text()='15']")).click();
	Thread.sleep(2000);
	//case2:
//	driver.findElement(By.xpath("//div[text()='August 2024']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='15']")).click();
	//case3:
	
String monthName = "September 2024";
	String date = "13";
	driver.findElement(By.xpath("//div[text()='"+monthName+"']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='"+date+"']")).click();
}
}
