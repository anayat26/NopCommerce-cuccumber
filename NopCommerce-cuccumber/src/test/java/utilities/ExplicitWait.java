package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public WebDriver driver;

	public ExplicitWait(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForElent(WebElement element, long timeOutInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	

}
