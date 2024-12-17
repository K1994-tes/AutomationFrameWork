package AdvanceScenarios;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Windowswitching 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String mainId = driver.getWindowHandle();//win1
		System.out.println(mainId);
		
		Set<String> allIds= driver.getWindowHandles(); //win1, win2
		System.out.println(allIds);
		
		for(String id : allIds)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
	}
}
