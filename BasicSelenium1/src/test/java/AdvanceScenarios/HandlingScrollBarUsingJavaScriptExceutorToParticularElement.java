package AdvanceScenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandlingScrollBarUsingJavaScriptExceutorToParticularElement 
{
	public static void main(String[]args)throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele=driver.findElement(By.xpath("//a[text()='Services']"));
	System.out.println(ele.getLocation().getX());
	System.out.println(ele.getLocation().getY());
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(267,806)");
	ele.click();
	
	/*JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",ele);
	ele.click();*/
	
	}
}
