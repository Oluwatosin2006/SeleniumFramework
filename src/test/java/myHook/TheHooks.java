package myHook;


import java.io.IOException;

import io.cucumber.java.*;
import resources.Base;

public class TheHooks extends Base{
	
	
	@Before
	public void setup() throws IOException {
		
        driver=initializeDriver();
        driver.get(prop.getProperty("url"));
		
	}
	
	  @After
	    public void closure() {
		
		driver.close();
	}
}
