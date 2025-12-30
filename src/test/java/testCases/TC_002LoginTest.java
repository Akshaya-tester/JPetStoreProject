package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002LoginTest extends BaseClass {
	@Test(dependsOnMethods = "testCases.TC_001RegistrationTests.RegistrationTest")
	public void TestLogin() throws InterruptedException
	{
		try
		{
			logger.info("Started Executing Registration Test");
			HomePage hp=new HomePage(driver);
			hp.click_sign_in();
			logger.info("Clicked on Sign In button");
			LoginPage lp=new LoginPage(driver);
			lp.enter_uname(TestData.userID);
			logger.info("Entered username");
			lp.clear_textbox();
			lp.enter_pwd(TestData.registeredPassword);
			logger.info("Entered password");
			lp.click_login();
			logger.info("Clicked Login button");
			String act_msg=lp.login_msg();
			String exp_msg="Welcome "+ TestData.firstName+"!";
			Assert.assertEquals(act_msg, exp_msg);
			Assert.assertTrue(true, "Login failed!");
		}
		catch(Exception e)
		{
			logger.error("Login Test FAILED due to exception: ", e);

            Assert.fail("Login Test failed due to exception: " + e.getMessage());
		}
		logger.info("Finished Executing Login Test");
	
	}

}
