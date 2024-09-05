/*
 * package stepdefinitions;
 * 
 * import java.io.IOException;
 * 
 * import org.testng.Assert; import io.cucumber.java.After; import
 * io.cucumber.java.Before; import io.cucumber.java.en.*; import
 * pagefactory.AccountPage; import pagefactory.LandingPage; import
 * pagefactory.LoginPage; import resources.Base;
 * 
 * public class Login extends Base{
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
 * @Given("user is on landingPage") public void user_is_on_landingPage() throws
 * IOException, InterruptedException{
 * 
 * lp=new LandingPage(driver); lp.myAccount().click(); lp.loginLink().click();
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @When("navigate to login page and enters \"(.*)\" and \"(.*)\"$") public void
 * navigate_to_login_page_and_enters_username_and_password(String email, String
 * pwd) throws InterruptedException{
 * 
 * login=new LoginPage(driver); login.emailField().sendKeys(email);
 * login.passwordField().sendKeys(pwd);
 * 
 * 
 * }
 * 
 * @And("user clicks on login button") public void user_clicks_on_login_button()
 * {
 * 
 * login.clickLogin().click();
 * 
 * }
 * 
 * @Then("verify user is able to successfully login") public void
 * verify_user_is_able_to_successfully_login() {
 * 
 * acc=new AccountPage(driver);
 * Assert.assertTrue(acc.editAccountInformationOption().isDisplayed());
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */