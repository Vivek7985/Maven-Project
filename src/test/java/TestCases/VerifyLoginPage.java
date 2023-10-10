package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLoginPage extends BaseClass {

	@Test
	public void verifylogin() throws IOException, InterruptedException {
		
		driverinitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    LoginPageObject obj=new LoginPageObject(driver);
	    
	    obj.enterUsername().sendKeys("viveksale7985@gmail.com");
	    Thread.sleep(1000);
	    
	    obj.enterPassword().sendKeys("Vivek@7985");
	    Thread.sleep(1000);
	    
	    obj.ClickOnLOgin().click();
	    Thread.sleep(3000);
	    
	    obj.ClickOnTryForFree().click();
	    Thread.sleep(2000);
	    
	    System.out.println("Done");
	    driver.quit();
	
	}
}
