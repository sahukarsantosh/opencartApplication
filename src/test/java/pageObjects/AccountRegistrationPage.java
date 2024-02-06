package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver  driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='reg_password']")
	WebElement txtPassword;
	
	
	@FindBy(xpath="//input[@name='register']")
	WebElement btnSubmit;
	
	
	//methods
	public void setUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void setSubmitButton()
	{
		btnSubmit.click();
		
	}
	
	
	
	

	
	
	

}
