package FrameWork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InsertDataToPropertiesFile
{
	public static void main(String[]args) throws Throwable
	{
		//InsertData
FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData1.properties.txt");//readmode
		Properties pro = new Properties();
		pro.setProperty("Url", "https://www.saucedemo.com/v1/");
		pro.setProperty("UserName", "standard_user");
		pro.setProperty("PassWord", "secret_sauce");
		
		FileOutputStream fes = new FileOutputStream("./src/test/resources/PropertiesData1.properties.txt");
		pro.store(fes, "CommonData");
		
	//	----------------------------------------------------------------------------------
		//Reading Data
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//step1: set the path of the physical file
		FileInputStream fis1 = new FileInputStream("./src/test/resources/PropertiesData1.properties.txt");
		//step2: Load all the data into properties class
		Properties pro1= new Properties();
		pro.load(fis1);
		//step3: Fetching data from properties_file
		String URL = pro.getProperty("Url");
		String USERNAME = pro.getProperty("UserName");
		String PASSWORD = pro.getProperty("PassWord");
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
	}
}
