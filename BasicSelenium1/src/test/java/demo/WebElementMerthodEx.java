
package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WebElementMerthodEx {


			public static void main(String[] args) throws Throwable {
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.in");
				//method1:-sendKeys()
				//driver.findElement(By.name("field-keywords")).sendKeys("puma");
				
				//method2:-click()
				//driver.findElement(By.cssSelector("[type='submit']")).click();
			
				//method3:-submit()
		/*	WebElement searchBar = driver.findElement(By.name("field-keywords"));
			searchBar.sendKeys("bluetooth");
			  searchBar.submit();
			   Thread.sleep(2000);
				
				//method4:-clear()
				searchBar.clear();*/

				
				
				//method5:-getLocation()
			WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
			   System.out.println(ele.getLocation().getX());
			    System.out.println(ele.getLocation().getY());
			    
			    //method6:-getSize()
		    System.out.println(ele.getSize().getHeight());
		    System.out.println(ele.getSize().getWidth());
			    
			    //method7:-getRect()
		//	    System.out.println(ele.getRect().getX());
		//	   System.out.println(ele.getRect().getY());
		//	    System.out.println(ele.getRect().getHeight());
		//.out.println(ele.getRect().getWidth());
		}
	}

