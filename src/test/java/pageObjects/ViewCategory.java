package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCategory extends BasePage {
	public ViewCategory(WebDriver driver)
	{
		super(driver);
	}
	
	//fish
	@FindBy(xpath="//a[normalize-space()='FI-SW-01']")
	WebElement fish_cat1;
	
	@FindBy(xpath="//a[normalize-space()='FI-SW-02']")
	WebElement fish_cat2;
	
	@FindBy(xpath="//a[normalize-space()='FI-FW-01']")
	WebElement fish_cat3;
	
	@FindBy(xpath="//a[normalize-space()='FI-FW-02']")
	WebElement fish_cat4;
	
	//dogs
	@FindBy(xpath="//a[normalize-space()='K9-BD-01']")
	WebElement dogs_cat1;
	
	@FindBy(xpath="//a[normalize-space()='K9-PO-02']")
	WebElement dogs_cat2;
	
	@FindBy(xpath="//a[normalize-space()='K9-DL-01']")
	WebElement dogs_cat3;
	
	@FindBy(xpath="//a[normalize-space()='K9-RT-01']")
	WebElement dogs_cat4;
	
	@FindBy(xpath="//a[normalize-space()='K9-RT-02']")
	WebElement dogs_cat5;
	
	@FindBy(xpath="//a[normalize-space()='K9-CW-01']")
	WebElement dogs_cat6;
	
	//cats
	@FindBy(xpath="//a[normalize-space()='FL-DSH-01']")
	WebElement cat_cat1;
	
	@FindBy(xpath="//a[normalize-space()='FL-DLH-02']")
	WebElement cat_cat2;
	
	//reptiles
	@FindBy(xpath="//a[normalize-space()='RP-SN-01']")
	WebElement reptiles_cat1;
	
	@FindBy(xpath="//a[normalize-space()='RP-LI-02']")
	WebElement reptiles_cat2;
	
	//birds
	@FindBy(xpath="//a[normalize-space()='AV-CB-01']")
	WebElement birds_cat1;
	
	@FindBy(xpath="//a[normalize-space()='AV-SB-02']")
	WebElement birds_cat2;
	
	public void click_category(String pet, String productid)
	{
		if(pet.equalsIgnoreCase("fish"))
		{
			if(productid.equals("FI-SW-01"))
				fish_cat1.click();
			else if(productid.equals("FI-SW-02"))
				fish_cat2.click();
			else if(productid.equals("FI-FW-01"))
				fish_cat3.click();
			else if(productid.equals("FI-FW-02"))
				fish_cat4.click();
		}
		else if(pet.equalsIgnoreCase("dog"))
		{
			if(productid.equals("K9-BD-01"))
				dogs_cat1.click();
			else if(productid.equals("K9-PO-02"))
				dogs_cat2.click();
			else if(productid.equals("K9-DL-01"))
				dogs_cat3.click();
			else if(productid.equals("K9-RT-01"))
				dogs_cat4.click();
			else if(productid.equals("K9-RT-02"))
				dogs_cat5.click();
			else if(productid.equals("K9-CW-01"))
				dogs_cat6.click();
		}
		else if(pet.equalsIgnoreCase("cat"))
		{
			if(productid.equals("FL-DSH-01"))
				cat_cat1.click();
			else if(productid.equals("FL-DLH-02"))
				cat_cat2.click();
		}
		else if(pet.equalsIgnoreCase("reptiles"))
		{
			if(productid.equals("RP-SN-01"))
				reptiles_cat1.click();
			else if(productid.equals("RP-LI-02"))
				reptiles_cat2.click();
		}
		else if(pet.equalsIgnoreCase("birds"))
		{
			if(productid.equals("AV-CB-01"))
				birds_cat1.click();
			else if(productid.equals("AV-SB-02"))
				birds_cat2.click();
		}
	}
	
	
	
	
	
	
	

}
