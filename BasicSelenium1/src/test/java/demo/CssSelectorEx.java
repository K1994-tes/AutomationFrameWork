package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class CssSelectorEx 
{
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		//syntax1:- [AttributeName='AttributeValue']
	//	driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("[name='user-name']")).sendKeys("standard_user");
	    
	    // syntax2:-htmltag[AttributeName='AttributeValue']
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
	
	   // syntax3:- Supports only id()
	    //id------>#AttributeValue
	 
	    // driver.findElement(By.cssSelector("#login-button")).click();
	
	    //syntax4:-  Supports only id()
	   // htmltag#AttributeValue
	 
	    //  driver.findElement(By.cssSelector("input#login-button")).click();
	
	    //syntax5:- supports only className()
	    //className----> .AttributeValue
	    
	  //  driver.findElement(By.cssSelector(".btn_action")).click();
	
	    //syntax6:-supports only className()
	    //className----> htmltag.AttributeValue
	    
	     driver.findElement(By.cssSelector("input.btn_action")).click();
	}
	}

