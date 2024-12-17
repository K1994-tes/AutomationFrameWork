package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
public ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}
@FindAll({@FindBy(xpath= "//img[@class='inventory_item_img'][1]"), @FindBy(xpath="//img[@src='./img/bike-light-1200x1500.jpg']")})
private WebElement bagImg;
public WebElement getbagImg()
{
	return bagImg;
}

}