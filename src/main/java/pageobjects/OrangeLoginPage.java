package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class OrangeLoginPage extends Base{
	
	public OrangeLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private By txt_username=By.name("username");
	
	private By txt_password=By.name("password");
	
	private By submitButton =By.xpath("//*[@type='submit']");
	
	
	public void setUsername(String user) {
		
		driver.findElement(txt_username).sendKeys(user);
	}
	
    public void setPassword(String pwd) {
		
		driver.findElement(txt_password).sendKeys(pwd);
	}

    public void clickLogin() {
	
	driver.findElement(submitButton).click();

    }


}
