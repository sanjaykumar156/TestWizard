package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import utilities.Dataprovider;

public class Retesting extends BaseClass {
	@Test(dataProvider="logindata",groups= {"sanity"},dataProviderClass=Dataprovider.class)
	public void datadrivertesting(String username,String password,String status) {
		try {
			
		LoginPage lp= new LoginPage(driver);
		HomePage hp= new HomePage(driver);
		lp.clearuserfield();
		lp.clearpasswordfield();
		lp.username(username);
		lp.password(password);
		lp.button();
		//hp.HomeElementDisplayed();
		lp.errormessagedispalyed();
		boolean actualtext=hp.HomeElementDisplayed();
		if(status.equalsIgnoreCase("valid")) {
			if(actualtext==true) {
				hp.logout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(status.equalsIgnoreCase("invalid")) {
			if(actualtext==true) {
				hp.logout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e) {
			Assert.fail();
		}
		
	   }
		
	}



