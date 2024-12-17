package AdvanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingWebElement 
{
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='20']")).click();
		driver.findElement(By.xpath("//option[text()='Nov']")).click();
		driver.findElement(By.xpath("//option[text()='2010']")).click();
}
}