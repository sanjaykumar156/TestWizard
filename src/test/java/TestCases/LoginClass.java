package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginClass extends BaseClass{
	@Test(groups= {"sanity"})
	public void login() {
		rb= ResourceBundle.getBundle("config");
		LoginPage lp= new LoginPage(driver);
		HomePage hp= new HomePage(driver);
		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();
		Assert.assertEquals(lp.hometitle(), true);
		hp.logout();

		
		}
			}

