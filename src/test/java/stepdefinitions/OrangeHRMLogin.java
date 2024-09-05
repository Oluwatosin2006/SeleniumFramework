package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageobjects.DashboardPage;
import pageobjects.OrangeLoginPage;
import resources.Base;

public class OrangeHRMLogin extends Base{

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

	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {

		driver.get(prop.getProperty("baseUrl"));
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {

		orange = new OrangeLoginPage(driver);
		orange.setUsername(username);
		orange.setPassword(password);
		
	}

	@And("user click login button")
	public void user_click_login_button() {

		orange.clickLogin();
	}

	@Then("user navigate to dashboard page")
	public void user_navigate_to_dashboard_page() {

		dashboard = new DashboardPage(driver);
		dashboard.logoIsDisplayed();
	}

	@And("user click on Admin button")
	public void user_click_on_admin_button() {

		dashboard.clickAdmintab();

	}

	@Then("user navigate to management page")
	public void user_navigate_to_management_page() {

		dashboard.userManagementDisplayed();
	}
	@Then("user click on PIM button")
	public void user_click_on_pim_button() {
		dashboard.clickPimtab();
	}

	@Then("user navigate to employee page")
	public void user_navigate_to_employee_page() {

	}
	

	}

	




