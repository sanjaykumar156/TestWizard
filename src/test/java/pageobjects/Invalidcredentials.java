package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invalidcredentials extends BasePage {

	public Invalidcredentials(WebDriver driver) {
		super(driver);
	
	}
	//locators
	@FindBy(id="lblError")
	WebElement txtwarning;
	
	public boolean warningtext() {
		return txtwarning.isDisplayed();
		
		
		
		
	}

}

