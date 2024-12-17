package AdvanceScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchingPrivateWindows 
{
public static void main(String[]args)
{
	// for private chrome  browser
/*	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();*/

	EdgeOptions opt = new EdgeOptions();
	opt.addArguments("--InPrivate");
	 WebDriver driver = new EdgeDriver(opt);
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	 
}
}
