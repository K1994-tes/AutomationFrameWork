package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
public class Assignment1 
{
	@Test
public  void  Assignment1()
{
		// pull back 
		// pushing done by eng1

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		
	 List<WebElement> PhnNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	 List<WebElement> phnPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	int count=0;
	for (WebElement name : PhnNames)
	{
		System.out.println(name.getText());
		count++;
	}
	System.out.println("total num of phones"+count);
	for (int i = 0; i < PhnNames.size(); i++)
	{
		System.out.println(PhnNames.get(i).getText()+"-----------"+phnPrice.get(i).getText());
	}
	
	}
	}

