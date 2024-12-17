package AdvanceScenarios;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> allSugg =driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		Thread.sleep(1000);
		for(WebElement ele : allSugg)
		{
		System.out.print(ele.getText());
		if(ele.getText().contains("puma t shirt"))
		{
			ele.click();
		}
	}
		}
}