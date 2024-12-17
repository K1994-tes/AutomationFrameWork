package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class AmazonEx 
{
	@Test
public  void AmazonEx ()
{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        
//        driver.findElement(By.cssSelector("[type='text']")).sendKeys("bluetooth");
//       driver.findElement(By.cssSelector("input[value='Go']")).click();
        
//        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
//        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
	//pull back
        //push back
        
  }
}
