package AdvanceScenarios;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HandlingWaits {
	 
	private static final ExpectedConditions ExceptedConditions = null;

	public static void main(String[]args)
	 {
		 WebDriver driver= new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//version3:-
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//version4:-	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
      WebElement loginButton=	driver.findElement(By.id("login-button"));
      loginButton.click();
      
    //  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    //  wait.until(ExpectedConditions.elementToBeClickable(loginButton));
       //  loginButton.click();
      
     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
     // wait.until(ExpectedConditions.titleContains("Hello"));
      wait.until(ExceptedConditions.titleContains("Swag Labs"));
      driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
       
  //     FluentWait wait= new FluentWait(driver);
  //     wait.pollingEvery(Duration.ofSeconds(1));
  //     wait.withTimeout(Duration.ofSeconds(10));
 //      wait.until(ExpectedConditions.elementToBeClickable(loginButton));
 //      loginButton.click();
       
      

	 }
}
