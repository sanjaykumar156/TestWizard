package TestCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Invalidcredentials;
import pageobjects.LoginPage;

public class Invalidcredentialsclass extends BaseClass {
	
	@Test(groups= {"regression"})
	public void invaluddata() {
		Invalidcredentials ic= new Invalidcredentials(driver);
		LoginPage lp= new LoginPage(driver);
		HomePage hp= new HomePage(driver);
		lp.username("191812014");
		lp.password("reasfchgj");
		lp.button();
		Assert.assertEquals(ic.warningtext(), true);		
	

}
}