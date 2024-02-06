package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='My Account']")
	WebElement MyAccount;
	
	public void myAccount()
	{
		MyAccount.click();
	}

}
