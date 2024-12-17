package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass
{
public static void main(String[]args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
WebElement UserText =	driver.findElement(By.name("user-name"));
UserText.sendKeys("standard_user",Keys.CONTROL+"a");
UserText.sendKeys(Keys.CONTROL+"c");
UserText.sendKeys(Keys.TAB,Keys.CONTROL+"v");
	
}
}
