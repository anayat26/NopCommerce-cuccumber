package pageObjestcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(id="Email")
WebElement UserId_Input;

@FindBy(id="Password")
WebElement Password_Input;

@FindBy(xpath="//input[@type='submit']")
WebElement LoginBtn_click;

@FindBy(linkText="Logout")
WebElement LogoutBtn_click;

	
public void emidId(String uName) {
	UserId_Input.sendKeys(uName);
}
public void pasword(String psw) {
	Password_Input.sendKeys(psw);
}
public void submit() {
	LoginBtn_click.click();
}
public void logout() {
	LogoutBtn_click.click();
}

}
