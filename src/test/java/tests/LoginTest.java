package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.AccountPage;
import pagefactory.LandingPage;
import pagefactory.LoginPage;
import resources.Base;

public class LoginTest extends Base{
	
	public WebDriver driver; // use for the screenshoot purpose
	
	@Test
	public void landingTest() {
		
		log.info("********* Starting LoginTest*********");
		
		try {
		LandingPage lp=new LandingPage(driver);
		lp.myAccount().click();
		lp.loginLink().click();
		log.info("My account is clicked");
	
		LoginPage login=new LoginPage(driver);
		login.emailField().sendKeys(prop.getProperty("email"));
		login.passwordField().sendKeys(prop.getProperty("password"));
		login.clickLogin().click();
		
		AccountPage acc=new AccountPage(driver);
		
		if(acc.editAccountInformationOption().isDisplayed()) {
			
			Assert.assertTrue(true);
			log.info("Passed");
		}
		else {
			Assert.assertTrue(false);
			log.info("Failed");
		}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	    log.info("********* Finished LandingPageTest*********");	
      }
	
	@BeforeMethod
	public void openApplication() throws IOException  {
		
	    driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Initialized driver");
		
		
	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}

}
