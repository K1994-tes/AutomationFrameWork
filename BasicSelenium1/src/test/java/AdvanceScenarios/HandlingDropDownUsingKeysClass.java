package AdvanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;
public class HandlingDropDownUsingKeysClass
{
public static void main(String[]args)throws Throwable
{
	//3 approches:
	//key class
	//robot class
	//select class
	
	//keys class
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(2000);
	WebElement dateList= driver.findElement(By.name("birthday_day"));
	dateList.click();
	dateList.sendKeys(Keys.ARROW_UP);
	dateList.sendKeys(Keys.ARROW_UP);
	dateList.sendKeys(Keys.ARROW_UP);
	dateList.sendKeys(Keys.ARROW_UP);
	
	WebElement monthList= driver.findElement(By.name("birthday_month"));
	monthList.click();
	monthList.sendKeys(Keys.ARROW_UP);
	monthList.sendKeys(Keys.ARROW_UP);
	
	WebElement yearList= driver.findElement(By.name("birthday_year"));
	yearList.click();
	yearList.sendKeys(Keys.ARROW_DOWN);
	yearList.sendKeys(Keys.ARROW_DOWN);
	yearList.sendKeys(Keys.ARROW_DOWN);
	yearList.sendKeys(Keys.ARROW_DOWN);
	
	
}
}
