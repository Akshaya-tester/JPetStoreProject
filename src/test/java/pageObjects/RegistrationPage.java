package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage{
	WebDriverWait mywait;
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement user_id;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement new_pwd;
	
	
	@FindBy(xpath="//input[@name='repeatedPassword']")
	WebElement repeat_pwd;
	
	@FindBy(xpath="//input[@name='account.firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='account.lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='account.email']")
	WebElement emaill;
	
	@FindBy(xpath="//input[@name='account.phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='account.address1']")
	WebElement address1;
	
	@FindBy(xpath="//input[@name='account.address2']")
	WebElement address2;
	
	@FindBy(xpath="//input[@name='account.city']")
	WebElement cityy;
	
	@FindBy(xpath="//input[@name='account.state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='account.zip']")
	WebElement zip;
	
	@FindBy(xpath="//input[@name='account.country']")
	WebElement country;
	
	@FindBy(xpath="//select[@name='account.languagePreference']")
	WebElement language_drpdwn;
	
	@FindBy(xpath="//select[@name='account.favouriteCategoryId']")
	WebElement fav_category_drpdwn;
	
	@FindBy(xpath="//input[@name='account.listOption']")
	WebElement mylist;
	
	@FindBy(xpath="//input[@name='account.bannerOption']")
	WebElement mybanner;
	
	@FindBy(xpath="//input[@name='newAccount']")
	WebElement save;
	
	public void userid(String uid)
	{
		user_id.sendKeys(uid);
	}
	public void newpwd(String pwd)
	{
		new_pwd.sendKeys(pwd);
	}
	public void repeatpwd(String rpwd)
	{
		repeat_pwd.sendKeys(rpwd);
	}
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void lastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void email(String email1)
	{
		emaill.sendKeys(email1);
	}
	public void phone(String phn)
	{
		phone.sendKeys(phn);
	}
	public void address1(String addres1)
	{
		address1.sendKeys(addres1);
	}
	public void address2(String addres2)
	{
		address2.sendKeys(addres2);
	}
	public void cityy(String city1)
	{
		cityy.sendKeys(city1);
	}
	public void statee(String state1)
	{
		state.sendKeys(state1);
	}
	public void zipp(String zip1)
	{
		zip.sendKeys(zip1);
	}
	public void country(String c)
	{
		country.sendKeys(c);
		/*
		 * Select myselect=new Select(country); myselect.selectByVisibleText(c);
		 */
		
	}
	public void lang(String lan) throws InterruptedException
	{
		language_drpdwn.click();
		mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(language_drpdwn));
		Thread.sleep(1000);
		Select myselect=new Select(language_drpdwn); 
		myselect.selectByVisibleText(lan);
	}
	
	public void catgry(String cat) throws InterruptedException
	{
		fav_category_drpdwn.click();
		mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOf(fav_category_drpdwn));
		Thread.sleep(1000);
		Select myselect=new Select(fav_category_drpdwn); 
		myselect.selectByVisibleText(cat);
	}
	public void click_list()
	{
		mylist.click();
	}
	public void click_banner()
	{
		mybanner.click();
	}
	
	public void click_save_btn()
	{
		save.click();
	}
	

}
