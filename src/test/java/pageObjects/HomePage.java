package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement sign_in_btn;
	
	@FindBy(xpath="//img[@src='../images/fish_icon.gif']")
	WebElement fish_btn;
	
	@FindBy(xpath="//img[@src='../images/dogs_icon.gif']")
	WebElement dog_btn;
	
	@FindBy(xpath="//img[@src='../images/cats_icon.gif']")
	WebElement cat_btn;
	
	@FindBy(xpath="//img[@src='../images/reptiles_icon.gif']")
	WebElement reptile_btn;
	
	@FindBy(xpath="//img[@src='../images/birds_icon.gif']")
	WebElement bird_btn;
	
	
	public void click_sign_in()
	{
		sign_in_btn.click();
	}

	public void click_fish()
	{
		fish_btn.click();
	}
	public void click_dog()
	{
		dog_btn.click();
	}
	public void click_cat()
	{
		cat_btn.click();
	}
	public void click_reptile()
	{
		reptile_btn.click();
	}
	public void click_bird()
	{
		bird_btn.click();
	}
	

}
