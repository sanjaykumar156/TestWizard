package TestCases;

import java.util.ResourceBundle;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.OfferPge;

public class OfferClass extends BaseClass{
	
	@Test(groups= {"smoke"})
	public void offerpage() throws InterruptedException {
		rb= ResourceBundle.getBundle("config");
		LoginPage lp= new LoginPage(driver);
		HomePage hp= new HomePage(driver);
		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();
		OfferPge of= new OfferPge(driver);
		of.offerbutton();
		of.detailsbutton();
		of.deactivatebutton();
		of.yesbutton();
		Thread.sleep(6);
		hp.logout();
//		try{
//			hp.logout();
//		}catch(NoSuchElementException e ) {
//			e.getStackTrace();
//			
//			
//		}
		
		
	}

}
