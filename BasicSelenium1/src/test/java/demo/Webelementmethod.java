package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethod
{
	public static void main(String[]args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	//	driver.get("https://www.facebook.com/");
/*		WebElement logo= driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
		if(logo.isDisplayed())
		{
			System.out.println("Facebook name is displayed");
		}
		else
		{
			System.out.println("Facebook name is not displayed");
		}*/
	
/*		WebElement link= driver.findElement(By.xpath("//a[text()='Create new account']"));
	if(link.isEnabled())
		{
			link.click();
		}
		else
		{
			System.out.print("element is not enabled");
		}
		Thread.sleep(3000);
WebElement radio= driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		if(radio.isSelected())
		{
			System.out.print("radio button is selected");
			
		}
		else
		{
			System.out.print("radio button not selected");
		}*/
	
		//Amazon App
		driver.get("https://www.amazon.in");
 //	WebElement search =driver.findElement(By.name("field-keywords"));
	//	System.out.println(search.getTagName());
		
	//	WebElement ele=driver.findElement(By.linkText("Amazon miniTV"));
	//	System.out.println(ele.getTagName());
		
	//	System.out.println(search.getAttribute("id"));
	//	System.out.println(ele.getAttribute("href"));
		
	//	System.out.println(search.getDomAttribute("class"));
	//	WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	//	System.out.println(logo.getDomProperty("nextSibling"));
		
	//WebElement searchBar=driver.findElement(By.name("field-keywords"));
	//	System.out.println(searchBar.getAriaRole());
		
	//	WebElement ele =driver.findElement(By.linkText("Today's Deals"));
	//		System.out.println(ele.getAriaRole());
				
				
			//	System.out.println(searchBar.getAccessibleName());
		//WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		//System.out.println(logo.getAccessibleName());
				
	//	WebElement link=driver.findElement(By.cssSelector("[aria-label='Amazon.in']"));
	//	System.out.println(link.getAccessibleName());
	
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele= driver.findElement(By.linkText("Log in"));
	System.out.println(ele.getCssValue("color"));
		
	/*	driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String name= driver.findElement(By.xpath("//span[text()=\"Mens Mc Trainer 2 Men's Workout ShoesRunning Shoes\"]")).getText();
		System.out.println(name);*/
		
	}
}
