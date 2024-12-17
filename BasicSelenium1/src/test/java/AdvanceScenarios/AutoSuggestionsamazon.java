package AdvanceScenarios;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsamazon {
	@Test
	public void AutoSuggestionsamazon() throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		Thread.sleep(2000);
		List<WebElement> allSugg =driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(1000);
		for(WebElement ele : allSugg)
		{
		System.out.print(ele.getText());
		if(ele.getText().contains("nike shoes"))
		{
			ele.click();
		}
	}
		}
}
