package AdvanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{
	public static void main(String[]args)
	{
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.clinique.in/");
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[name()='svg' and @aria-labelledby='gnav-cart-icon']")).click();
		
}
}