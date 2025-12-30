package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckOutPage extends BasePage {
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Proceed to Checkout']")
	WebElement checkout_btn;
	
	@FindBy(xpath="//input[@name='newOrder']")
	WebElement order_confirm;
	
	@FindBy(xpath="//a[@class='Button']")
	WebElement order;
	
	@FindBy(xpath="//li[text()='Thank you, your order has been submitted.']")
	WebElement mess;
	
	public void click_checkout()
	{
		checkout_btn.click();
	}
	public void click_order_confirm()
	{
		order_confirm.click();
		order.click();
	}
	
	public String getMess()
	{
		try
		{
			return mess.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}

}
