package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Scenario1 
{
public static void main(String[] args)
{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//syntax1:- xpath by Attribute
		//htmltag[@AttributeNAme='AttributeValue']
       driver.findElement(By.xpath("//input[@aria-label='Search http://Amazon.in']")).sendKeys("Bluetooth");
       driver.findElement(By.xpath("//input[@type='submit']")).click();

        //syntax2:- xpath by VisibleText
		//htmltag[text()='AttributeValue']
     String name = driver.findElement(By.xpath("//span[text()='amazon basics True Wireless in-Ear Earbuds with Mic, Touch Control, IPX5 Water-Resistance, Bluetooth 5.3, Up to 55 Hours Play Time, Voice Assistance and Fast Charging (Blue)']")).getText();
     System.out.println(name);
     
 	//syntax3:- xpath by contains Attribute
		//htmltag[contains(@AttributeName,'AttributeValue')]
//	driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("Puma");
//	driver.findElement(By.xpath("//input[contains(@id,'ton')]")).click();
	
	//syntax4:- xpath by contains visibleText
	  //htmltag[contains(text(),'AttributeValue')]
	driver.findElement(By.xpath("//a[contains(text(),\"Tod\")]")).click();
	}
}
