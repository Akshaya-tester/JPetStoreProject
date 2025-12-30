package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001RegistrationTests extends BaseClass {
	
	@Test
	public void RegistrationTest() throws InterruptedException
	{
		try
		{
		logger.info("Started Executing Registration Test");
		HomePage hp=new HomePage(driver);
		hp.click_sign_in();
		LoginPage lp=new LoginPage(driver);
		lp.click_register_now();
		RegistrationPage rp=new RegistrationPage(driver);
		String userId=randomeNumber();
		rp.userid(userId);
		TestData.userID=userId;
		String s=randomAlphaNumeric();
		rp.newpwd(s);
		TestData.registeredPassword=s;
		rp.repeatpwd(s);
		String fname=randomeString();
		rp.firstname(fname);
		TestData.firstName=fname;
		rp.lastname(randomeString());
		String remail=randomeString()+"@gamil.com";
		rp.email(remail);
		TestData.registeredEmail=remail;
		rp.phone(randomeNumber());
		rp.address1(randomeString());
		rp.address2(randomeString());
		rp.cityy(randomeString());
		rp.statee(randomeString());
		rp.zipp(randomeString());
		rp.country(randomeString());
		rp.lang("english");
		rp.catgry("DOGS");
		rp.click_list();
		rp.click_banner();
		rp.click_save_btn();
		System.out.println(remail);
		System.out.println(s);
		System.out.println(fname);
		}
		catch(Exception e)

		{
			 // Log the full error
            logger.error("Registration Test FAILED due to an exception: ", e);

            // Fail the test properly so TestNG marks it as failed
            Assert.fail("Registration Test failed due to exception: " + e.getMessage());
		}
		logger.info("Finished Executing Registration Test");
		
	}

}
