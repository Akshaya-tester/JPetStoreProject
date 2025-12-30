package testCases;


import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ViewCategory;
import testBase.BaseClass;

public class TC_003AddToCartTest extends BaseClass {
	@Test
	public void AddToCart()
	{
		try
		{
			
			logger.info("Started Testing Add To Cart Functionality");
			HomePage hp=new HomePage(driver);
			hp.click_sign_in();
			Thread.sleep(1000);
			LoginPage lp=new LoginPage(driver);
			lp.enter_uname("Akshaya");
			lp.clear_textbox();
			lp.enter_pwd("Akshaya");
			lp.click_login();
			Thread.sleep(2000);
			
			
			

			
			Thread.sleep(2000);
			String petname=p.getProperty("pet");
			//System.out.println(petname);
			//Thread.sleep(2000);
			if(petname.equalsIgnoreCase("fish"))
				hp.click_fish();
			else if(petname.equalsIgnoreCase("dog"))
				hp.click_dog();
			else if(petname.equalsIgnoreCase("cat"))
				hp.click_cat();
			else if(petname.equalsIgnoreCase("reptile"))
				hp.click_reptile();
			else if(petname.equalsIgnoreCase("bird"))
				hp.click_bird();
			ViewCategory vc=new ViewCategory(driver);
			vc.click_category(petname, p.getProperty("product_id"));
			AddToCartPage cart=new AddToCartPage(driver);
			cart.click_add_to_cart(p.getProperty("item_ID"));
			Thread.sleep(3000);
			cart.click_cart();
			CheckOutPage ch=new CheckOutPage(driver);
			ch.click_checkout();
			Thread.sleep(3000);
			
			ch.click_order_confirm();
			String exp_msg=ch.getMess();
			String act_msg="Thank you, your order has been submitted.";
			Assert.assertEquals(act_msg, exp_msg);
			logger.info("Product added successfully to the cart and order confirmed!!");
		}
		catch(Exception e)
		{
            logger.error("AddToCart Test FAILED due to an exception: ", e);
            Assert.fail("Add To cart test failed due to exception:"+e.getMessage());
		}
		logger.info("Finished executing Add To cart test");
	}

}
