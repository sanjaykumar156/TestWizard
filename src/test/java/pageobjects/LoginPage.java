package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	//locators
	
	@FindBy(id="txtusername")
	WebElement txtusername;
	
	@FindBy(id="txtpassword")
	WebElement txtpassword;
	
	@FindBy(id="btnlogin")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@id='lblError']")
	WebElement errormessage;
	
	@FindBy(xpath="//h3[normalize-space()='Home']")
	WebElement homepagecheck;
	
	
	public void username(String username) {
		txtusername.sendKeys(username);
	}
	public void password(String password) {
		txtpassword.sendKeys(password);
	}
	public void button() {
		loginbtn.click();
	}
	public void clearuserfield() {
		txtusername.clear();
	}
	public void clearpasswordfield() {
		txtpassword.clear();
	}
	public boolean hometitle() {
		return homepagecheck.isDisplayed();
	}
	
	
		public boolean errormessagedispalyed() {
			return errormessage.isDisplayed();
}
}
