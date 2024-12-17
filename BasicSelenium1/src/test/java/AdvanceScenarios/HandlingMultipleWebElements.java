package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements 
{
public static void main(String[]args)
{
	WebDriver driver= new ChromeDriver();
	//driver.get("https://www.flipkart.com");
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));//= shortcut key to check no of links in the web page
	 int count=0;
	 for(WebElement link : allLinks)
	 {
		// System.out.println(link.getText());//---- fetches visible text of the link
		 System.out.println(link.getAttribute("href"));//----fetches the href AttributeValue
		 count++;
	 }
	System.out.println("total num of links:"+count);
	}
}
