package AdvanceScenarios;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RobotClassEx 
{
	@Test  
public void RobotClassEx () throws Throwable
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	 driver.findElement(By.name("field-keywords")).sendKeys("Reebok");
	 Robot rob= new Robot();
	 rob.keyPress(KeyEvent.VK_ENTER);
	 rob.keyRelease(KeyEvent.VK_ENTER);
}
}
