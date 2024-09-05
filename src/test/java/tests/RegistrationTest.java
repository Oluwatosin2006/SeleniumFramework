package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.LandingPage;
import pagefactory.MessagePage;
import pagefactory.RegistrationPage;
import resources.Base;

public class RegistrationTest extends Base{
	
	public WebDriver driver;
	
	@Test
	public void registerTest() {
			
	
	log.info("********* Starting Registration*********");
	
	try {
	LandingPage lp=new LandingPage(driver);
	lp.myAccount().click();
	log.info("Clicked on MyAccount Link");
	lp.registerLink().click();
	log.info("Clicked on MyRegister Link");
	
	RegistrationPage reg = new RegistrationPage(driver);
	
	log.info("Providing customer details.....");
	reg.txt_Firstname().sendKeys(randomString().toUpperCase());
	reg.txt_Lastname().sendKeys(randomString().toUpperCase());
	reg.txt_Email().sendKeys(randomString()+"@gmail.com");
	reg.txt_PhNumber().sendKeys(randomNumber());
	
	String password=randomAlphaNumeric();
	log.info("Creating dynamic password.....");
	reg.createPassword().sendKeys(password);
	reg.confirmPassword().sendKeys(password);
	reg.policyAgreement().click();
	reg.continueButton().click();
	
	MessagePage message = new MessagePage(driver);
	

    log.info("Validating expected message");
	String msg=message.msgConfirmation().getText();
	
	if(msg.equals("Your Account Has Been Created!")) {
		Assert.assertTrue(false); // should be true but for fail purpose i put false
	}
	else
	{   

		log.error("Test failed");
		log.debug("Debug logs");
		Assert.assertTrue(false); 
	}
	
	}
	catch(Exception e) {
		
		Assert.fail();
	}
	
	log.info("****** Finished TC001_AccountRegistrationTest *****");
	
	
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