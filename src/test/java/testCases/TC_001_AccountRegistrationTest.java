package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.*; 

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	

	
	
	@Test(groups= {"regression", "master"})
	public void verify_account_registration() 
	{
		try
		{
		logger.info("*** starting the very account registration ***");
		logger.debug("logs Application start...!");
		HomePage hm = new HomePage(driver);
		hm.myAccount();
		logger.info("clicked on my account");
		
		AccountRegistrationPage arpage=new AccountRegistrationPage(driver);
		arpage.setUsername(randomeString()+"@gmail.com");
		logger.info("Generated the randome username/email id ");
		String password = randomeAlphaNumeric();
		arpage.setPassword(password);
		logger.info("generated the randome password");
		arpage.setSubmitButton();
		logger.info("clicked on the button");
		}
		catch (Exception e)
		{
			logger.error("testcase got failed");
			Assert.fail();
		}
		
		logger.debug("logs application end...");
		logger.info("***Finish the 1st testcase***");
		
	}
	
}





















