package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeysClass 
{
public static void main(String[]args)
{
	//Approach1:- KeysClass
	//Approach1:- RobotClass
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	//case1:-
//	WebElement UserText= driver.findElement(By.name("user-name"));
//	UserText.sendKeys("standard_user",Keys.TAB);
//	driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
	
	//case2:-
	driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	
}
}
