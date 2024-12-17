package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Traversing 
{
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.findElement(http://By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		//Traversing using parent child Relationship
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
	//  System.out.println(price);
	
		//Traversing using Sibling
		String price1 = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
	//  System.out.println(price1);
	
    	String name = driver.findElement(By.xpath("//div[text()='₹65,499']/../../../preceding-sibling::div[@class='col col-7-12']/div[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
	//  System.out.println(name);

	    //Traversing using ancestor and descendant
    	
    	String phName = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']//div[@class='Nx9bqj _4b5DiR']")).getText();
	  //  System.out.println(phName);
    	
	    String phnName = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
	    System.out.println(phnName);
	
	}
}
