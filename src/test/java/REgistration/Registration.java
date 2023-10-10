package REgistration;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.RegistrationPage;
import resources.BaseClass;

public class Registration extends BaseClass {

	@Test
	public void Register() throws IOException, InterruptedException {
		
		driverinitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    RegistrationPage obj=new RegistrationPage(driver);
	    
	    obj.enterFirstName().sendKeys("VIVEK");
	    Thread.sleep(2000);
	    
	    obj.enterLastName().sendKeys("SALE");
	    Thread.sleep(2000);
	    
	    obj.enterEmail().sendKeys("viveksale7985@gmail.com");
	    Thread.sleep(2000);
	    
	    Select jobTitle=new Select(obj.selectJobTitle());
	    jobTitle.selectByIndex(6);
	    Thread.sleep(2000);
	    
	    obj.enterCompany().sendKeys("369 INVESTING AND TRADING COMPANY");
	    Thread.sleep(2000);
	    
	    Select Employee=new Select(obj.ClickOnEmployees());
	    Employee.selectByIndex(6);
	    
	    obj.enterPhone().sendKeys("7770098183");
	    Thread.sleep(2000);
	    
	    Select Country=new Select(obj.SelectCountry());
	    Country.selectByVisibleText("Israel");
	    
	   driver.quit();
		
	
	
	}
}
