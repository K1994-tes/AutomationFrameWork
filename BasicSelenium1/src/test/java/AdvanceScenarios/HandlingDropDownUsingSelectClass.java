package AdvanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass 
{
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement dateList= driver.findElement(By.name("birthday_day"));
		Select select= new Select(dateList);
	//	select.selectByIndex(19);
		//select.selectByValue("10");
		select.selectByVisibleText("5");
		
		Thread.sleep(2000);
		WebElement monthList= driver.findElement(By.name("birthday_month"));
		Select select1= new Select(monthList);
	//	select1.selectByIndex(0);
		//select1.selectByValue("12");
		select1.selectByVisibleText("Sep");
		
		Thread.sleep(2000);
		WebElement yearList= driver.findElement(By.name("birthday_year"));
		Select select2= new Select(yearList);
	//select2.selectByIndex(34);
	//	select2.selectByValue("1990");
		select2.selectByVisibleText("1994");
	}		
}
