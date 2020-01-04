package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjestcs.AddCustomer;
import pageObjestcs.Login;
import pageObjestcs.SearchCustomer;
import utilities.BaseClass;

public class Steps extends BaseClass {
	
	@Before
	public void setup() throws Exception {
		readConfig=new Properties();
		FileInputStream fil=new FileInputStream("./Config.properties");
		readConfig.load(fil);
		
		String br=readConfig.getProperty("browser");
		
		if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", readConfig.getProperty("chromepath"));
		driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("iepath")) {
			System.setProperty("webdriver.ie.driver", readConfig.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
	}
	
	
	

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		lg = new Login(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String psw) {
		lg.emidId(email);
		lg.pasword(psw);
	}

	@When("click on login")
	public void click_on_login() {
		lg.submit();
	}

	@When("user click on log out link")
	public void user_click_on_log_out_link() {
		lg.logout();
	}

	@When("close browser")
	public void close_browser() {
		driver.quit();
	}
	// Add new customer

	@When("click on customer menu")
	public void click_on_customer_menu() {
		adcust=new AddCustomer(driver);
		adcust.customerBtn();
	}

	@Then("click on customer")
	public void click_on_customer() {
	adcust.CustotmerItem();
	}

	@Then("click on add new")
	public void click_on_add_new() {
		adcust.addnewCust();
	}

	@When("enter customer information")
	public void enter_customer_information() {
		String email=randamString()+"@yahoo.com";
		adcust.email(email);
		adcust.pasword("123");
		adcust.firstName("jan");
		adcust.lastName("qurban");
		adcust.genderMale();
		adcust.dateOB("01/01/2000");
		adcust.company("xyz");
			
	}

	@Then("click save button")
	public void click_save_button() {
		adcust.saveBtn();
	}
	//Search Customer by EmailID
	
	@Then("enter Email ID")
	public void enter_Email_ID() {
	   srchCust=new SearchCustomer(driver);
	   srchCust.email("brenda_lindgren@nopCommerce.com");
	}

	@Then("click on search Btn")
	public void click_on_search_Btn() {
		srchCust.searchCust();
	}
	// search customer by Name

	@Then("enter fisrt name")
	public void enter_fisrt_name() {
		srchCust=new SearchCustomer(driver);
		srchCust.firstName("James");
	}

	@Then("enter last name")
	public void enter_last_name() {
		srchCust.lastName("Pan");  
	}

}
