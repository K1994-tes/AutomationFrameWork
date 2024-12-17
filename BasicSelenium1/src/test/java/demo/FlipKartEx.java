package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class FlipKartEx 
{
	@Test
	public  void  FlipKartEx()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
            
		//using linktext()
	//	driver.findElement(By.linkText("Mobiles")).click();
	
		//using partialLinkText()
	//	driver.findElement(By.partialLinkText("Gro")).click();
		
		//using cssSelector
		//syntax1:- [AttributeName='AttributeValue']
	driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bluetooth");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	}
}
