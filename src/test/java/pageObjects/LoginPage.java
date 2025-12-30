package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@name='signon']")
	WebElement login_btn;
	
	@FindBy(xpath="//a[normalize-space()='Register Now!']")
	WebElement register_now_btn;
	
	@FindBy(xpath="//div[@id='WelcomeContent']")
	WebElement login_success_msg;
	
	public void enter_uname(String name)
	{
		username.sendKeys(name);
	}
	public void clear_textbox() throws InterruptedException
	{
		password.clear();
		Thread.sleep(3000);
	}
	public void enter_pwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void click_login()
	{
		login_btn.click();
	}
	public void click_register_now()
	{
		register_now_btn.click();
		
	}
	
	public String login_msg()
	{
		try
		{
			return login_success_msg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	

}
