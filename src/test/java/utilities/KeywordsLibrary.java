package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsLibrary {
	WebDriver driver;

    public void openBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("Browser opened successfully: " + browser);
        }
    }

    public void navigate(String url) {
        driver.get(url);
        System.out.println("Navigated to: " + url);
    }
    
    public void click_signin(String locatorType, String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).click();
    }
    
    public void click_registernow(String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).click();
    }
    public void userid(String data,String locatorValue)
    {
    	driver.findElement(By.name(locatorValue)).sendKeys(data);
    }
    public void newpwd(String data,String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).sendKeys(data);
    }
    public void rpwd(String data,String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).sendKeys(data);
    }
    public void fname(String data,String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).sendKeys(data);
    }
    public void lname(String data,String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).sendKeys(data);
    }
    public void email(String data,String locatorValue)
    {
    	driver.findElement(By.xpath(locatorValue)).sendKeys(data);
    }
    public void phone(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void address1(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void address2(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void city(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void state(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void zip(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void country(String data,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(data);
    }
    public void save(String zip,String locatorType)
    {
    	driver.findElement(By.xpath(locatorType)).sendKeys(zip);
    }
   
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed successfully.");
    }

}
