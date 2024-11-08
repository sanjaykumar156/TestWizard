package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferPge extends BasePage {

	public OfferPge(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@href='../StudentPortal/Offer.aspx']")
	WebElement btnoffer;
	
	@FindBy(xpath="//a[normalize-space()='View Offer Details']")
	WebElement btnofferdeatils;
	
	@FindBy(xpath="//button[normalize-space()='Deactivate']")
	WebElement deactivebtn;
	
	@FindBy(xpath="//button[@id='cphbody_btnDeactive']")
	WebElement btnyes;
	
	public void offerbutton() {
		btnoffer.click();
	}
	
	public void detailsbutton() {
		btnofferdeatils.click();
	}
	
	public void deactivatebutton() {
		deactivebtn.click();
	}
	public void yesbutton() {
		btnyes.click();
	}

}
