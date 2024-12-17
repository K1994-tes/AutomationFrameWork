package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutor 
{
	public static void main(String[]args)throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		for(int i=0; i<5; i++)
		{
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
		}

		for(int i=0; i<3; i++)
		{
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
		}
		
	}
}
