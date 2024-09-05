package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import resources.Base;

public class DashboardPage extends Base{
	
   public DashboardPage(WebDriver driver) {
		
		this.driver=driver;
	}
   
    private By logo=By.xpath("//img[@alt='client brand banner']");
	
	private By adminTab=By.xpath("//li[1]//a[1]//span[1]");
	
	private By managementTab=By.xpath("//span[normalize-space()='User Management']");
	
	private By pim = By.xpath("//span[normalize-space()='PIM']");
	
	private By configuration = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']");
	
    public void logoIsDisplayed() {
		
		boolean logo1=driver.findElement(logo).isDisplayed();
		Assert.assertTrue(logo1);
	
	}
	
	public void clickAdmintab() {
		
		driver.findElement(adminTab).click();
	}
	
	public void userManagementDisplayed() {
		
		boolean managementtab=driver.findElement(managementTab).isDisplayed();
		Assert.assertTrue(managementtab);
	}
	
	public void clickPimtab() {
		
		driver.findElement(pim).click();
	}
	
	public void configurationTabIsDisplayed() {
		
		driver.findElement(configuration).click();
	}

}
