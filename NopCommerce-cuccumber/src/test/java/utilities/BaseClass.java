package utilities;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjestcs.AddCustomer;
import pageObjestcs.Login;
import pageObjestcs.SearchCustomer;

public class BaseClass {
	
	public WebDriver driver;
	public Login lg;
	public AddCustomer adcust;
	public SearchCustomer srchCust;
	public Properties readConfig;
	
	// generate random emailID
		public static String randamString() {
				String generateEmail=RandomStringUtils.randomAlphabetic(5);
				return (generateEmail);
				
		}
	
	

}
