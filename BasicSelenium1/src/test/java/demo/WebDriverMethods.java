package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public static void main(String[] args) {
		
		//launching empty browser
		WebDriver driver=new ChromeDriver();

		//method1:-get()----->used to launch an application
		driver.get("https://www.flipkart.com");
	
		//method2:-getTitle()----->fetches the title of the webpage 
	   String title = driver.getTitle();
	    System.out.println(title);
	    
	    //method3:-getCurrentUrl()---->fetches the current url of the webpage
	   String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	   
	    //method4:-getPageSource()---->fetches the source code of the webpage
	 //  String source = driver.getPageSource();
	 // System.out.println(source);
	   
	   //method5:-manage()--->used for window action like(maximize,minimize etc)
	//   Options opt= driver.manage();
	//   Window win = opt.window();
	//   win.maximize();
	   //or
	driver.manage().window().maximize();
	
    driver.manage().window().minimize();
	
	
	}
}
