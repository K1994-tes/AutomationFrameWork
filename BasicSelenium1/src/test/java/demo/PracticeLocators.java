package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class PracticeLocators 
{
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
        driver.findElement(By.name("field-keywords")).sendKeys("puma");
	//	driver.findElement(By.linkText("Amazon miniTV")).click();
	 //  driver.findElement(By.linkText("Today's Deals")).click();
	//	driver.findElement(By.partialLinkText("Amazon m")).click();
	//	driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_3']")).click();
}
}
