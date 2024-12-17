package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUP 
{
	public static void main(String[]args) throws Throwable
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.get("https://www.irctc.co.in/nget/train-search ");
		driver.get("https://in.puma.com/in/en");
	//	driver.get("https://www.yatra.com/ ");
	//	driver.get("https://omayo.blogspot.com/");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);//----close
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_TAB);//----
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_TAB);
	    rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
