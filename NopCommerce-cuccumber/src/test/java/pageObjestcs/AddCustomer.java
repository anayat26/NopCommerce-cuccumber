package pageObjestcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomer {
	public WebDriver driver;

	public AddCustomer(WebDriver driver) {
		this.driver = driver;
	}

	By CustomerBtn_click = By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/a/i[2]");
	By CustomerItem_click = By.xpath("(//span[text()='Customers'])[2]");
	By AddNewcus_click = By.xpath("//a[@class='btn bg-blue']");
	By Email_Input = By.id("Email");
	By Password_Input = By.id("Password");
	By FirstName_Input = By.id("FirstName");
	By LastName_Input = By.id("LastName");
	By GenderMale_click = By.id("Gender_Male");
	By DOB_Input = By.id("DateOfBirth");
	By Company_Input = By.id("Company");
	By Save_click = By.name("save");

	public void customerBtn() {
		driver.findElement(CustomerBtn_click).click();
	}

	public void CustotmerItem() {
		driver.findElement(CustomerItem_click).click();
	}

	public void addnewCust() {
		driver.findElement(AddNewcus_click).click();
	}

	public void email(String email) {
		driver.findElement(Email_Input).sendKeys(email);
	}

	public void pasword(String psw) {
		driver.findElement(Password_Input).sendKeys(psw);
	}

	public void firstName(String fName) {
		driver.findElement(FirstName_Input).sendKeys(fName);
	}

	public void lastName(String lName) {
		driver.findElement(FirstName_Input).sendKeys(lName);
	}

	public void genderMale() {
		driver.findElement(GenderMale_click).click();
	}

	public void dateOB(String dob) {
		driver.findElement(DOB_Input).sendKeys(dob);
	}

	public void company(String comName) {
		driver.findElement(Company_Input).sendKeys(comName);
	}

	public void saveBtn() {
		driver.findElement(Save_click).click();
	}
	

}
