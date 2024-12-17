package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repo.LoginPage;
import POM_Repo.ProductPage;

public class POMImplementation {
	public static void main(String[] args) throws Throwable
	{

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData1.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("Url");
		String USERNAME = pro.getProperty("UserName");
		String PASSWORD = pro.getProperty("PassWord");
		driver.get(URL);
	//	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	//	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	//	driver.findElement(By.id("login-button")).click();
		//implementing using getter methods
/*	LoginPage login = new LoginPage(driver);
	login.getUserTextField().sendKeys(USERNAME);
    login.getPasswordTextField().sendKeys(PASSWORD);
	login.getLoginButton().click();		*/
	//implementing using Business Logics
	LoginPage login = new LoginPage(driver);
	login.loginToApp(USERNAME, PASSWORD);
	ProductPage page = new ProductPage(driver);
	page.getbagImg().click();
	
	}
}
