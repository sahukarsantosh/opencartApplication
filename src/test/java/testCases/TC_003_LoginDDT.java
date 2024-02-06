package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verify_LoginDDT(String email, String password, String exp)
	{
		
		logger.info("*** starting TC_003_LoginDDT***");
		try 
		{
			
		
			
			HomePage hp1=new HomePage(driver);
			
			//logger.info("clicked on MyAccount");
			hp1.myAccount();
			
			
			//Login page
			LoginPage lp=new LoginPage(driver);
			//logger.info("inserted the userID and password");
			lp.setLoginUser(email);
			lp.setLoginPass(password);
			lp.setLoginBTN();
			//logger.info("login button clicked");
			
			//MyAccount page
			MyAccount mya=new MyAccount(driver);
			boolean targetPage=mya.isMyAccountPageExists();
			
			
			if (exp.equalsIgnoreCase("valid"))
			{
				if(targetPage == true)
				{
					mya.logoutClick();
					Assert.assertTrue(true);
					
					
				}
				else 
				{
					Assert.assertTrue(false);
				}
				
			}
			
			if (exp.equalsIgnoreCase("invalid"))
			{
				if(targetPage == true)
				{
					mya.logoutClick();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		
		logger.info("***test finished...***");
	}
	
}
