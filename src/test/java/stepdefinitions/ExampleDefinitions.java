/*
 * package stepdefinitions;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.WebDriver; import org.testng.Assert;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pagefactory.AccountPage; import pagefactory.LandingPage; import
 * pagefactory.LoginPage; import resources.Base;
 * 
 * public class ExampleDefinitions extends Base{
 * 
 * 
 * LandingPage lp; LoginPage login; AccountPage acc;
 * 
 * @Before public void setup() throws IOException {
 * 
 * driver=initializeDriver(); driver.get(prop.getProperty("url"));
 * 
 * }
 * 
 * @After public void closure() {
 * 
 * driver.close(); }
 * 
 * 
 * @Given("^User is on landPage$") public void User_is_on_landPage() throws
 * IOException{
 * 
 * 
 * lp=new LandingPage(driver); lp.myAccount().click(); lp.loginLink().click();
 * 
 * 
 * }
 * 
 * @When("^user navigate to login page and enters Username as ([^\"]*) and Password as ([^\"]*) into the fields$"
 * ) public void
 * user_navigate_to_login_page_and_enters_Username_as_someusername_and_Password_as_somepassword_into_the_fields
 * (String username, String password) {
 * 
 * login=new LoginPage(driver); login.emailField().sendKeys(username);
 * login.passwordField().sendKeys(password);
 * 
 * 
 * }
 * 
 * @And("^user clicks on the button$") public void user_clicks_on_the_button() {
 * 
 * login.clickLogin().click();
 * 
 * }
 * 
 * @Then("^user should be able to log based on \"([^\"]*)\" login status$")
 * public void user_should_be_able_to_log_based_on_expected_login_status(String
 * expectedResult){
 * 
 * acc=new AccountPage(driver);
 * Assert.assertTrue(acc.editAccountInformationOption().isDisplayed());
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 */