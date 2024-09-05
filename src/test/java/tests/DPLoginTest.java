package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pagefactory.AccountPage;
import pagefactory.LandingPage;
import pagefactory.LoginPage;
import resources.Base;


public class DPLoginTest extends Base{
	
	public WebDriver driver;
	
	
	@Test(dataProvider="getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException {
		
		log.info("********* Starting LandingPageTest*********");
		LandingPage lp=new LandingPage(driver);
		lp.myAccount().click();
		lp.loginLink().click();
		
		LoginPage login = new LoginPage(driver);
		login.emailField().sendKeys(email);
		login.passwordField().sendKeys(password);
		login.clickLogin().click();
		log.info("login to application");
		
		AccountPage acc=new AccountPage(driver);
		
		String actualResult = null;
		
		try {
		if(acc.editAccountInformationOption().isDisplayed()) {
		actualResult ="Successful";
		log.info(actualResult);
		}
		
		}catch(Exception e) {
			actualResult ="Failure";
			log.info("validate message is false");
			
		}
		Assert.assertEquals(actualResult, expectedResult);
		

		log.info("********* Finished LandingPageTest*********");
	}
	
	@BeforeMethod
	public void openApplication() throws IOException  {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}


	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data= {{"peterwilliams3@gmail.com", "peterwilliams1", "Successful"},{"peterwilliams5@gmail.com", "williamspeter", "Failure"}};
		return data;
		
	}
}
