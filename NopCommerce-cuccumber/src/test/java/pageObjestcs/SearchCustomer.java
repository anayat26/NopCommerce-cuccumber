package pageObjestcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ExplicitWait;

public class SearchCustomer {

	public WebDriver driver;
	public ExplicitWait waits;

	public SearchCustomer(WebDriver driver) {
		this.driver = driver;
		waits=new ExplicitWait(driver);
	}

	By Email_Input = By.id("SearchEmail");
	By FirstName_Input = By.id("SearchFirstName");
	By LastName_Input = By.id("SearchLastName");
	By SearchCust_click = By.id("search-customers");

	public void email(String email) {
		driver.findElement(Email_Input).sendKeys(email);
	}

	public void firstName(String fName) {
		driver.findElement(FirstName_Input).sendKeys(fName);
	}

	public void lastName(String lName) {
		driver.findElement(LastName_Input).sendKeys(lName);
	}

	public void searchCust() {
		driver.findElement(SearchCust_click).click();
	}

}
