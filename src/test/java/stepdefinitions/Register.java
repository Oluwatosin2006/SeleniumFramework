/*
 * package stepdefinitions;
 * 
 * import java.io.IOException; import java.util.Map;
 * 
 * import org.testng.Assert;
 * 
 * import io.cucumber.datatable.DataTable; import io.cucumber.java.After; import
 * io.cucumber.java.Before; import io.cucumber.java.en.*; import
 * pagefactory.AccountPage; import pagefactory.LandingPage; import
 * pagefactory.MessagePage; import pagefactory.RegistrationPage; import
 * resources.Base;
 * 
 * public class Register extends Base{
 * 
 * LandingPage lp; AccountPage acc; RegistrationPage regPage; MessagePage mess;
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
 * @Given("user is on landing page") public void user_is_on_landing_page()
 * throws IOException {
 * 
 * lp=new LandingPage(driver); lp.myAccount().click();
 * lp.registerLink().click();
 * 
 * }
 * 
 * 
 * @When("user navigate to registerpage and enters new customer details using DataTable"
 * ) public void
 * user_navigate_to_registerpage_and_enters_new_customer_details_using_data_table
 * (DataTable data) {
 * 
 * Map<String, String> dataMap=data.asMap(String.class, String.class);
 * regPage=new RegistrationPage(driver);
 * regPage.txt_Firstname().sendKeys(dataMap.get("firstName"));
 * regPage.txt_Lastname().sendKeys(dataMap.get("lastName"));
 * regPage.txt_Email().sendKeys(dataMap.get("email"));
 * regPage.txt_PhNumber().sendKeys(dataMap.get("telephone"));
 * regPage.createPassword().sendKeys(dataMap.get("password"));
 * regPage.confirmPassword().sendKeys(dataMap.get("password"));
 * 
 * 
 * }
 * 
 * @And("user selects the privacy policy option") public void
 * user_selects_the_privacy_policy_option() {
 * 
 * regPage.policyAgreement().click();
 * 
 * }
 * 
 * @And("clicks on reg continue button") public void
 * clicks_on_reg_continue_button() {
 * 
 * regPage.continueButton().click();
 * 
 * }
 * 
 * @Then("user should be able to successfully register") public void
 * user_should_be_able_to_successfully_register() {
 * 
 * mess = new MessagePage(driver); boolean
 * msg=mess.msgConfirmation().isDisplayed(); Assert.assertTrue(msg);
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