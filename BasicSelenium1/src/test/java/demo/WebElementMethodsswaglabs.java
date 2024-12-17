package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsswaglabs 
{
public static void main(String[]args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
   WebElement userName = driver.findElement(By.name("user-name"));
   userName.sendKeys("standard_user");
   Thread.sleep(1000);
   userName.clear();
   Thread.sleep(1000);
   userName.sendKeys("standard_user");
    
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.id("login-button")).click();
//	
//	WebElement ele=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//	ele.click();
}
}
