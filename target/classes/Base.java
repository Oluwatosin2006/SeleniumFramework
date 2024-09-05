package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




    public class Base {
	
    public WebDriver driver;
	public Properties prop;
	public Logger log;
	
	
    public WebDriver initializeDriver() throws IOException  {
    	
    	log=LogManager.getLogger(this.getClass());
    	
    	prop= new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
	    String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
               
        }else if(browserName.equalsIgnoreCase("firefox")) {
	    	
	    	driver = new FirefoxDriver();
	    
	    }else if(browserName.equalsIgnoreCase("firefox")) {
	    	
	    	driver = new EdgeDriver();
	    }
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
		}
    
       public String randomString() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
		
	  }
	
	   public String randomNumber() {
		
		String generatednumber=RandomStringUtils.randomAlphanumeric(10);
		return generatednumber;
		
	  }
	
	   public String randomAlphaNumeric() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
        String generatednumber=RandomStringUtils.randomAlphanumeric(3);
		return (generatedstring+"@"+generatednumber);
		
      }
	   
	   public String takeScreenshot(String testName, WebDriver driver) throws IOException {
		   File SourceFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		   FileUtils.copyFile(SourceFile, new File(destinationFilePath));
		   
		   return destinationFilePath;
	   }
     
     
	



}
