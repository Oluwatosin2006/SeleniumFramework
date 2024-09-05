package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class RegistrationPage extends Base{
	
      
	public RegistrationPage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement txt_Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	
	private WebElement txt_Lastname;
	
	@FindBy(xpath="	//input[@id='input-email']")
	
	private WebElement txt_Email;

    @FindBy(xpath="//input[@id='input-telephone']")

    private WebElement txt_PhNumber;
    
    @FindBy(xpath="//input[@id='input-password']")

    private WebElement createPassword;

    @FindBy(xpath="//input[@id='input-confirm']")
    
    private WebElement confirmPassword;

	@FindBy(xpath="//input[@name='agree']")

    private WebElement policyAgreement;
    
	@FindBy(xpath="//input[@value='Continue']")

    private WebElement continueButton ;
	
	

	public WebElement txt_Firstname() {
		
	   return txt_Firstname;
	}
	
	public WebElement txt_Lastname() {
		
		return txt_Lastname;
	}
    public WebElement txt_Email() {
    	return txt_Email;
    }
    
    public WebElement txt_PhNumber() {
	
    	return txt_PhNumber;
   }
    
    public WebElement createPassword() {
    	return createPassword;
   }
   
    public WebElement confirmPassword() {
    	return confirmPassword;
   }
   
    public WebElement policyAgreement() {
	
    	return policyAgreement;
   }	

   public WebElement continueButton() {
	   
	   return continueButton;
  }
   
 
	
  }


