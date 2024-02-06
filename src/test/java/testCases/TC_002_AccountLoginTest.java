package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_002_AccountLoginTest extends BaseClass{

	
	@Test(groups= {"sanity", "master"})
	public void verify_login() {
		logger.info("***TC_002_AccountLoginTest is Started***");
		try {
		//homepage 
		HomePage hp=new HomePage(driver);
		
		logger.info("clicked on MyAccount");
		hp.myAccount();
		
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		logger.info("inserted the userID and password");
		lp.setLoginUser(p.getProperty("email"));
		lp.setLoginPass(p.getProperty("password"));
		lp.setLoginBTN();
		logger.info("login button clicked");
		
		//MyAccount page
		MyAccount mya=new MyAccount(driver);
		boolean targetPage=mya.isMyAccountPageExists();
		if(targetPage==true) 
		{
			logger.info("Validation test passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Validation test failed");
			Assert.fail(); 
			
		}
		
		mya.logoutClick();
		
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****Finished the TC_002_AccountLoginTest****");
	}
}
