package POM_Repo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id="user-name")
	private WebElement UserTextField;
	
	@FindBy(css = "[data-test=\"password\"]")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//input[@class=\"btn_action\"]")
	private WebElement LoginButton;
//getter method
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	//Buiness Logics
	public void loginToApp(String username,String password)
	{
		UserTextField.sendKeys(username);
		PasswordTextField.sendKeys(password);
		LoginButton.click();
		
	}
	
	}
