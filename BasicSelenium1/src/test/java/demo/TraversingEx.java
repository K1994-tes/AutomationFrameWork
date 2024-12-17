package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TraversingEx 
{
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
  String phnPrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
       System.out.println(phnPrice);
       
	}
}
