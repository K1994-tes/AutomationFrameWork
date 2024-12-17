package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket 
{
public static void main(String[]args) throws Throwable
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.bigbasket.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Apples");
	Thread.sleep(2000);
	List<WebElement>all=driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
	for(WebElement ele:all)
	{
		System.out.println(ele.getText());
		if(ele.getText().contains(" Baby Apple "))
		{
			
			ele.click();
			break;
			
		}
	}

}
}
