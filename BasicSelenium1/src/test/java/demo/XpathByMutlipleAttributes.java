package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class XpathByMutlipleAttributes 
{
	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
			
		//htmltag[@AttributeName='AttributeValue' and @AttributeNAme='AttributeValue']
		//driver.findElement(By.xpath("//a[@class='nav-a  ' and  @data-csa-c-slot-id='nav_cs_5']")).click();
			
		//htmltag[@AttributeName='AttributeValue' or @AttributeNAme='AttributeValue']
		//driver.findElement(By.xpath("//a[@tabindex='' or  @data-csa-c-slot-id='nav_cs_5']")).click();
			
		//htmltag[@AttributeName='AttributeValue' and text()='AttributeValue']
		//driver.findElement(By.xpath("//a[@data-csa-c-type='link' and text()='Amazon miniTV']")).click();
			
		//htmltag[contains(@AttributeName,'AttributeValue' and @AttributeNAme='AttributeValue']
		driver.findElement(By.xpath("//a[contains(text(),\"Tod\") or @data-csa-c-slot-id='nav_cs_3']")).click();
}
}
