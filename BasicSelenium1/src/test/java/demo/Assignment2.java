package demo;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scenario the print the name of the mobile with price higher then 50k
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.flipkart.com");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> PhName = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
		List<WebElement> PhPrice = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]/../../div[2]//div[@class='Nx9bqj _4b5DiR']"));
		for (int i = 0; i < PhName.size(); i++) {
			String price = PhPrice.get(i).getText().replace("₹", "").replace(",", "");
			int p = Integer.parseInt(price);
			if(p>70000) {
				System.out.println(PhName.get(i).getText()+" "+PhPrice.get(i).getText());
			}
		}
	}
}
