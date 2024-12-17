package AdvanceScenarios;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx2 {
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		//switching frame using index -------> index value starts from 0
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");
		
		//switching frame using id Attribute
	//	driver.switchTo().frame("singleframe");
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		//switching frame using name Atrribute
	//	driver.switchTo().frame("SingleFrame");
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gud noon");
		
		//switching frame using webelement
/*	WebElement ele=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	   driver.switchTo().frame(ele);
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud eveng");*/
	}
}
