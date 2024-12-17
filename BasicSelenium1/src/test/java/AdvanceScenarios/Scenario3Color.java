package AdvanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scenario3Color 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> colors = driver.findElements(By.xpath("//span[.='Apple iPhone 15 (128 GB) - Pink']/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
		for (WebElement Element : colors) 
		{
		String value = Element.getAttribute("aria-label");	
		System.out.println(value);
		}
		}
}
