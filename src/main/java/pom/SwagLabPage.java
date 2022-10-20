package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabPage {

	@FindBy (xpath="//input[@id='user-name']")private WebElement name;
	@FindBy (xpath="//input[@id=\"password\"]")private WebElement password;
	@FindBy (xpath="//input[@id=\"login-button\"]")private WebElement login;
	
	public SwagLabPage(WebDriver driver)
	{
		   PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String uname)
	{
		name.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
}
