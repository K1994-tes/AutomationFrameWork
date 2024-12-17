package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		//using id() locator
	//syntax id()---->AttributeName="AttributeValue"
    // driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		       //using Name Locator
	//syntax name()---->AttributeName="AttributeValue"
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
            //using className Locator
	      //syntax className()---->AttributeName="AttributeValue"
	   driver.findElement(By.className("btn_action")).click();
	
	}
}

