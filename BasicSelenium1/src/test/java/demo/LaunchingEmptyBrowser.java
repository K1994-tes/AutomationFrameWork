package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
public class LaunchingEmptyBrowser 
{
	public static void main(String[] args) 
	{
		//launching empty browser
		//case1:
		//selenium version:-3.141.59
	/*	String key = "webdriver.chrome.driver";
	//	String value = "./src/main/resources/chromedriver.exe";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver-win64 (12)";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();*/
		
				
	//case2:-Selenium version-3.141.59 webdrivermanager:5.9.1
	/*  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
		
	   WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();	*/
		
        //case3:-selenium version 4.22.0 webdrivermanager:5.9.1
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
		
		//case4:-Selenium version:-4.22.0
		
		//	WebDriver driver=new ChromeDriver();
		//  WebDriver driver=new EdgeDriver();
		    WebDriver driver=new FirefoxDriver();
}
}


