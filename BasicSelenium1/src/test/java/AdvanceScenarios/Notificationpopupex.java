package AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopupex 
{
public static void main(String[]args) throws Throwable
{
//	ChromeOptions opt =  new  ChromeOptions();
 //   opt.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyRelease(KeyEvent.VK_TAB);
	
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyRelease(KeyEvent.VK_TAB);
	
//	rob.keyPress(KeyEvent.VK_TAB);
//	rob.keyRelease(KeyEvent.VK_TAB);
	
//	rob.keyPress(KeyEvent.VK_TAB);
//	rob.keyRelease(KeyEvent.VK_TAB);

}
}
