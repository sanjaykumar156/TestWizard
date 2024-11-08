package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h3[@class='page-title']")
	WebElement textcheck;
	
	@FindBy(xpath="//a[@id='a1']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[@href='../StudentPortal/Offer.aspx']")
	WebElement btnoffer;
	
	@FindBy(xpath="//a[normalize-space()='View Offer Details']")
	WebElement btnofferdeatils;
	
	@FindBy(xpath="//button[normalize-space()='Deactivate']")
	WebElement deactivebtn;
	
	@FindBy(xpath="//button[@id='cphbody_btnDeactive']")
	WebElement btnyes;
	
	
	 public boolean HomeElementDisplayed() {
		return textcheck.isDisplayed();
		
	}
	public void logout() {
		logoutbtn.click();
	}
	

}
