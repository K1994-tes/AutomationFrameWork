package AdvanceScenarios;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesUsingWebelement {
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/frames ");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		// using Webelement
		WebElement topFrame=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		
		//switching to left Frame using 3rd apporach
		WebElement leftFrame=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftFrame);
		String left= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(left);
		
		//switching frame from child to immediate parent
		driver.switchTo().parentFrame();
		
		//switching to middle Frame using 3rd apporach
		WebElement middleFrame= driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		
}
}