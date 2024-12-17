package AdvanceScenarios;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingWith2Windows 
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
	//switching to 2nd window	
		Set<String> allWin= driver.getWindowHandles(); //win1, win2
		for(String win : allWin)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Register now!']")).click();
		//----------------------------------------------------------------------------
		// switching to 3rd window
	Set<String> allWin1= driver.getWindowHandles(); //win1, win2
		for(String win1 : allWin1)
		{
			driver.switchTo().window(win1);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Appium Conf 2024"))
			{
				break;
			}
		}
	driver.findElement(By.xpath("//a[text()='View Details']")).click();
//	driver.quit();  // closes all windows including browser
//	driver.close(); //closes the window 3rd currently in focus
	//------------------------------------------------------------------------------------------
	//switching driver to 1st window through title and closing
	Set<String> allWin2= driver.getWindowHandles(); //win1, win2
	for(String win2 : allWin2)
	{
		driver.switchTo().window(win2);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Frames & windows"))
		{
			break;
		}
	}
	driver.close();
	}
}