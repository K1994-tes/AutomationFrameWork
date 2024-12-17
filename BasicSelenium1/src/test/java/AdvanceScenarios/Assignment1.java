package AdvanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 
{
	public static void main(String[]args) throws Throwable
	{
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9908831120");
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Karatekid@1994");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    Thread.sleep(2000);
	
	//handling mouse actions
    WebElement ele=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
     Actions act= new Actions(driver);
      act.moveToElement(ele).perform();
      Thread.sleep(2000);
      
     driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//div[@class='a-column a-span9 a-span-last'])[4]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[@id='ya-myab-plus-address-icon']")).click();
     
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("guddeti keerthi");
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9059380546");
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("520012");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("3-1-228/b,near sitara convention,ss vaibhav apartments line");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("vidhyadharapuram");
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("sitara convention");
    Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
}
}

