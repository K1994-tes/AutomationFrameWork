
package AdvanceScenarios;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopuppractice 
{
	public static void main(String[]args)throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/frames ");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		// using id or name 
	/*   driver.switchTo().frame("frame-bottom");
	    String bottomframe=	   driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		   System.out.print("bottomframe");*/
		
/*	WebElement ele=	driver.findElement(By.xpath("//frame[@name='frame-left']"));
			driver.switchTo().frame(ele);
	 String leftframe =	driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		   System.out.print("leftframe");*/
		
		WebElement topFrame=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		
		WebElement leftFrame=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftFrame);
		String left= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(left);
		
		//driver.switchTo().frame(topFrame); ----> not working so we used parentframe()
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		String middleFrame= driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(middleFrame);
		
		driver.switchTo().defaultContent();//----> we can switch to grandparent directly
		
		driver.switchTo().frame("frame-bottom");
		String bottomFrame= driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottomFrame);
		
		
		}
	}		

