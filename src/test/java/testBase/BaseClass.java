package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public static  WebDriver driver;
	public Logger logger;//for logging
	public Properties p;
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException
	{
		/*
		 * FileReader file=new FileReader("./src/test/resources/config.properties");
		 * p=new Properties(); p.load(file);
		 * logger=LogManager.getLogger(this.getClass());//log4j2 driver=new
		 * ChromeDriver(); driver.get(p.getProperty("url"));
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * Thread.sleep(2000);
		 */
		
		//to handle browser level popups like change password alerts.
		
		
		FileReader file = new FileReader("./src/test/resources/config.properties");
	    p = new Properties();
	    p.load(file);

	    logger = LogManager.getLogger(this.getClass());

	    ChromeOptions options = new ChromeOptions();

	    // Disable browser-level popups
	    options.addArguments("--incognito");
	    options.addArguments("--disable-save-password-bubble");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--disable-infobars");
	    options.addArguments("--disable-extensions");
	    options.addArguments("--disable-popup-blocking");

	    // Use fresh chrome profile (VERY IMPORTANT)
	    options.addArguments("--user-data-dir=C:\\temp\\chrome-profile");

	    Map<String, Object> prefs = new HashMap<>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("profile.password_manager_enabled", false);

	    options.setExperimentalOption("prefs", prefs);

	    driver = new ChromeDriver(options);   // ✅ OPTIONS APPLIED HERE

	    driver.get(p.getProperty("url"));
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String captureScreen(String tname)throws IOException
	{
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+tname +"_"+timeStamp+".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
		
	}
	public String randomeNumber()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomeString()
	{
		String generatedString;
		return generatedString=RandomStringUtils.randomAlphabetic(8);
	}
	public String randomAlphaNumeric()
	{
		String generatedAlphaNum;
		return generatedAlphaNum=RandomStringUtils.randomAlphanumeric(8);
	}
	

}
