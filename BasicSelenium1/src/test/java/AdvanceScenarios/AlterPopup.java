package AdvanceScenarios;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopup {

	public static void main(String[]args) 
	{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	 Alert alt = driver.switchTo().alert();
	 String txt=alt.getText();//----> fetches the alter message
	System.out.println(alt);
	alt.accept();//----> click on OK button
	
/*	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	driver.switchTo().alert().accept();//---> click on OK button
	driver.switchTo().alert().dismiss();//---> click on cancel button*/
	
/*	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	driver.switchTo().alert().sendKeys("good evening");
	driver.switchTo().alert().accept();*/
	}
}
