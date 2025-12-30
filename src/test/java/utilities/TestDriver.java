package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestDriver{
	public static Logger logger;//for logging


	public static void main(String[] args) {
		logger=LogManager.getLogger();//log4j2
		ExcelUtils excel = new ExcelUtils("D:\\java_eclipse\\LearningWorkspace\\JPetStoreProject\\testData\\registrationData.xlsx", "Sheet1");
        KeywordsLibrary key = new KeywordsLibrary();
        logger.info("started executing registration test using hybrid framework");

        int rowCount = excel.getRowCount();
        for (int i = 1; i <= rowCount; i++) {
            String keyword = excel.getCellData(i, 0);
            String locatorType = excel.getCellData(i, 1);
            String locatorValue = excel.getCellData(i, 2);
            String testdata = excel.getCellData(i, 3);
            
            switch (keyword) {
                case "OpenBrowser":
                    key.openBrowser(testdata);
                    break;
                    
                case "Navigate":
                    key.navigate(testdata);
                    break;
                    
                case "click_signin":
                    key.click_signin(locatorType,locatorValue);
                    break;
                case "click_registernow":
                    key.click_registernow(locatorValue);
                    break;
                    
                case "userid":
                    key.userid(testdata,locatorValue);
                    break;
                    
                case "newpwd":
                    key.newpwd(testdata,locatorValue);
                    break;
                    
                case "rpwd":
                    key.rpwd(testdata,locatorValue);
                    break;
                    
                case "fname":
                    key.fname(testdata,locatorValue);
                    break;
                    
                case "lname":
                    key.lname(testdata,locatorValue);
                    break;
                    
                case "email":
                    key.email(testdata,locatorValue);
                    break;
                    
                case "phone":
                    key.phone(testdata,locatorValue);
                    break;
                    
                case "address1":
                    key.address1(testdata,locatorValue);
                    break;
                    
                case "address2":
                    key.address2(testdata,locatorValue);
                    break;
                    
                case "city":
                    key.city(testdata,locatorValue);
                    break;
                    
                case "state":
                    key.state(testdata,locatorValue);
                    break;
                    
                case "zip":
                    key.zip(testdata,locatorValue);
                    break;
                    
                case "country":
                    key.country(testdata,locatorValue);
                    break;
                    
                case "save":
                    key.save(testdata,locatorValue);
                    break;
                
                case "closeBrowser":
                    key.closeBrowser();
                    break;
            }

        }
        logger.info("finished executing registration test using hybrid framework");

    }

	}

