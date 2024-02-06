package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='username']")
	WebElement txtLoginUser;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtLoginPass;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement btnLogin;
	
	
	public void setLoginUser(String email)
	{
		txtLoginUser.sendKeys(email);
		
	}
	
	public void setLoginPass(String pwd)
	{
		txtLoginPass.sendKeys(pwd);
		
	}
	
	public void setLoginBTN()
	{
		btnLogin.click();
	}

}
