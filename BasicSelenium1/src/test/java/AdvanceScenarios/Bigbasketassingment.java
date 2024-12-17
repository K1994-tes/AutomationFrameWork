package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasketassingment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");
		
 		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("apples");
 		Thread.sleep(2000);
 		List<WebElement> allsug = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
 		
 		for(WebElement ele:allsug) {
 			System.out.println(ele.getText());
 			if (ele.getText().trim().equals("Baby Apple"))
 			{
 				ele.click();
 				break;
 			}
 		}
 		Thread.sleep(2000);
 		System.out.print(driver.findElement(By.cssSelector("[class='Description___StyledH-sc-82a36a-2 bofYPK']")).getText());
 		System.out.print("----------------");
 		System.out.print(driver.findElement(By.cssSelector("td[class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText()+"\n\n");
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//div[@class='pr-6.5']//button[@pattern='filled']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//div[@class='pr-6.5']//button[contains(@class,'bwKrKT')])[1]")).click();
 		
 		
 		

	}


}
