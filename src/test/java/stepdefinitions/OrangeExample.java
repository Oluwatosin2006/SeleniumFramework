package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DashboardPage;
import pageobjects.OrangeLoginPage;
import resources.Base;

public class OrangeExample extends Base{
	
	
	OrangeLoginPage orange;
	DashboardPage dashboard;
	
	@Before
	public void setup() throws IOException {
		
        driver=initializeDriver();
        
     }
	
	  @After
	    public void closure() {
		
		driver.close();
	}

	@Given("user is on loginPage")
	public void user_is_on_loginpage() throws IOException {

		driver.get(prop.getProperty("baseUrl"));
	}

	@When("^user enters Username as ([^\"])* and Password as ([^\"])* in the field$")
	public void user_enters_Username_as_username_and_Password_as_password_in_the_field(String user, String pass) {

		orange = new OrangeLoginPage(driver);
		orange.setUsername(user);
		orange.setPassword(pass);
		
	}

	@And("user clicks on the login button")
	public void user_click_on_the_login_button() {

		orange.clickLogin();
	}
	

	
	@Then("^user should be able to successfully loged in based on ([^\"]*) result$")
	public void user_should_be_able_to_successfully_loged_in_based_on_expected_result(String expextedResult) {
		
		dashboard = new DashboardPage(driver);
	    dashboard.logoIsDisplayed();
		
		
	}

}
