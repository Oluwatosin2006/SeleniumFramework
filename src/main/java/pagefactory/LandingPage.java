package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	  
		@FindBy(xpath="//*[@title='My Account']")
		private WebElement myAccount;
		
		@FindBy(xpath="//a[normalize-space()='Register']")
		private WebElement registerLink;
		
		@FindBy(linkText="Login")
		private WebElement loginLink;
		
		//@FindBy(xpath="//strong[normalize-space()='I am a returning customer']")
		//WebElement msgIsDisplayed;
		
		
	    public WebElement myAccount() {
	    	
	    	return myAccount;
	    }
	    
	    public WebElement registerLink() {
			
	    	return registerLink;
		}
	    
	    public WebElement loginLink() {
	    	
	    	return loginLink;
	    }
	    
		   
		   
		   
	   }

