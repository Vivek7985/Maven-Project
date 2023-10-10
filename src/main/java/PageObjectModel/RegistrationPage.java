package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	public static WebDriver driver;
	
	private By FirstName=By.name("UserFirstName");
	
	private By LastName=By.name("UserLastName");
	
	private By Email=By.name("UserEmail");
	
	private By JobTitle=By.name("UserTitle");
	
	private By Company=By.name("CompanyName");
	
	private By Employees=By.name("CompanyEmployees");
	
	private By Phone=By.name("UserPhone");

	private By Country=By.name("CompanyCountry");
	
	private By IAgree=By.className("checkbox-ui");
	
	
	public RegistrationPage(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	public WebElement enterFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
	}
	
	public WebElement selectJobTitle ()
	{
		return driver.findElement(JobTitle);
	}
	
	public WebElement enterCompany()
	{
		return driver.findElement(Company);
	}
	
	public WebElement ClickOnEmployees()
	{
		return driver.findElement(Employees);
	}
	
	public WebElement enterPhone()
	{
		return driver.findElement(Phone);
	}
	
	public WebElement SelectCountry()
	{
		return driver.findElement(Country);
	}
	
	
}
