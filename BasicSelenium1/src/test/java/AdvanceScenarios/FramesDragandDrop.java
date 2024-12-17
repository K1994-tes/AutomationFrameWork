package AdvanceScenarios;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FramesDragandDrop {
	public static void main(String[]args)
	{
		WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
      
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager ");
		WebElement frames=	driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frames);
		
		WebElement drag=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		WebElement drag1=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions act1= new Actions(driver);
		act1.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions act2= new Actions(driver);
		act2.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement drop3=driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions act3= new Actions(driver);
		act3.dragAndDrop(drag3, drop3).perform();
}
}