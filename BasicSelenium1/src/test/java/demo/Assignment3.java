package demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment3 
{
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");

		//case1:-
	//	driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("mangoes");
	//driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[1]")).sendKeys("mangoes");
	
		//case2:-
//	WebElement search = driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]"));
//	search.sendKeys("mangoes");
//	search.submit();
	
		//case3:-
 driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("mangoes",Keys.ENTER);
		
 Thread.sleep(2000);
 List<WebElement> names = driver.findElements(By.xpath("(//div[@class='break-words h-10 w-full'])[position()<=3]"));
 List<WebElement> prices = driver.findElements(By.xpath("(//div[@class='Pricing___StyledDiv-sc-pldi2d-0 bUnUzR'])[position()<=3]"));
 
 
 for (int i = 0; i < names.size(); i++)
 {
//	 String price = prices.get(i).getText();
//	String txt=price.toString().replace("", " ");
	 
	 System.out.println(names.get(i).getText()+"-------"+prices.get(i).getText());
 }
	}
}
