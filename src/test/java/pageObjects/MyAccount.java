package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

	public MyAccount(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//a[normalize-space()='shipping and billing addresses']")
	WebElement txtDashboard;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logout;
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (txtDashboard.isDisplayed());
		}
		catch (Exception e)
		{
			return (false);
		}
	}
	
	public void logoutClick()
	{
		logout.click();
	}
	
	

}
