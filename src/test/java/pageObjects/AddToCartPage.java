package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {
	public AddToCartPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='EST-1']")
	WebElement item_id1;
	@FindBy(xpath="//a[normalize-space()='EST-2']")
	WebElement item_id2;
	@FindBy(xpath="//a[normalize-space()='EST-3']")
	WebElement item_id3;
	@FindBy(xpath="//a[normalize-space()='EST-4']")
	WebElement item_id4;
	@FindBy(xpath="//a[normalize-space()='EST-5']")
	WebElement item_id5;
	@FindBy(xpath="//a[normalize-space()='EST-20']")
	WebElement item_id20;
	@FindBy(xpath="//a[normalize-space()='EST-21']")
	WebElement item_id21;
	@FindBy(xpath="//a[normalize-space()='EST-6']")
	WebElement item_id6;
	@FindBy(xpath="//a[normalize-space()='EST-7']")
	WebElement item_id7;
	@FindBy(xpath="//a[normalize-space()='EST-8']")
	WebElement item_id8;
	@FindBy(xpath="//a[normalize-space()='EST-9']")
	WebElement item_id9;
	@FindBy(xpath="//a[normalize-space()='EST-10']")
	WebElement item_id10;
	@FindBy(xpath="//a[normalize-space()='EST-28']")
	WebElement item_id28;
	@FindBy(xpath="//a[normalize-space()='EST-22']")
	WebElement item_id22;
	@FindBy(xpath="//a[normalize-space()='EST-23']")
	WebElement item_id23;
	@FindBy(xpath="//a[normalize-space()='EST-24']")
	WebElement item_id24;
	@FindBy(xpath="//a[normalize-space()='EST-25']")
	WebElement item_id25;
	@FindBy(xpath="//a[normalize-space()='EST-26']")
	WebElement item_id26;
	@FindBy(xpath="//a[normalize-space()='EST-27']")
	WebElement item_id27;
	@FindBy(xpath="//a[normalize-space()='EST-27']")
	WebElement item_id14;
	@FindBy(xpath="//a[normalize-space()='EST-15']")
	WebElement item_id15;
	@FindBy(xpath="//a[normalize-space()='EST-16']")
	WebElement item_id16;
	@FindBy(xpath="//a[normalize-space()='EST-17']")
	WebElement item_id17;
	@FindBy(xpath="//a[normalize-space()='EST-11']")
	WebElement item_id11;
	@FindBy(xpath="//a[normalize-space()='EST-12']")
	WebElement item_id12;
	@FindBy(xpath="//a[normalize-space()='EST-13']")
	WebElement item_id13;
	@FindBy(xpath="//a[normalize-space()='EST-18']")
	WebElement item_id18;
	@FindBy(xpath="//a[normalize-space()='EST-19']")
	WebElement item_id19;
	
	@FindBy(xpath="//*[contains(text(),'Add to Cart')]")
	WebElement add_to_cart_btn;
	
	
	
	public void click_add_to_cart(String item_id)
	{
		if(item_id.equals("EST-1"))
		    item_id1.click();
		else if(item_id.equals("EST-2"))
		    item_id2.click();
		else if(item_id.equals("EST-3"))
		    item_id3.click();
		else if(item_id.equals("EST-4"))
		    item_id4.click();
		else if(item_id.equals("EST-5"))
		    item_id5.click();
		else if(item_id.equals("EST-6"))
		    item_id6.click();
		else if(item_id.equals("EST-7"))
		    item_id7.click();
		else if(item_id.equals("EST-8"))
		    item_id8.click();
		else if(item_id.equals("EST-9"))
		    item_id9.click();
		else if(item_id.equals("EST-10"))
		    item_id10.click();
		else if(item_id.equals("EST-11"))
		    item_id11.click();
		else if(item_id.equals("EST-12"))
		    item_id12.click();
		else if(item_id.equals("EST-13"))
		    item_id13.click();
		else if(item_id.equals("EST-14"))
		    item_id14.click();
		else if(item_id.equals("EST-15"))
		    item_id15.click();
		else if(item_id.equals("EST-16"))
		    item_id16.click();
		else if(item_id.equals("EST-17"))
		    item_id17.click();
		else if(item_id.equals("EST-18"))
		    item_id18.click();
		else if(item_id.equals("EST-19"))
		    item_id19.click();
		else if(item_id.equals("EST-20"))
		    item_id20.click();
		else if(item_id.equals("EST-21"))
		    item_id21.click();
		else if(item_id.equals("EST-22"))
		    item_id22.click();
		else if(item_id.equals("EST-23"))
		    item_id23.click();
		else if(item_id.equals("EST-24"))
		    item_id24.click();
		else if(item_id.equals("EST-25"))
		    item_id25.click();
		else if(item_id.equals("EST-26"))
		    item_id26.click();
		else if(item_id.equals("EST-27"))
		    item_id27.click();
		else if(item_id.equals("EST-28"))
		    item_id28.click();

		
	}
	public void click_cart() throws InterruptedException
	{
		Thread.sleep(2000);
		add_to_cart_btn.click();
	}
	

}
