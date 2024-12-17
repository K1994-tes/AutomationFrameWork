package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class SawglabLocators 
{
public static void main(String[] args) 
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		//using id() loactor
	//syntax id()---->AttributeName="AttributeValue"
    //  driver.findElement(http://By.id("user-name")).sendKeys("standard_user");
	//	driver.findElement(http://By.id("password")).sendKeys("secret_sauce");
	//	driver.findElement(http://By.id("login-button")).click();
	
}
}
