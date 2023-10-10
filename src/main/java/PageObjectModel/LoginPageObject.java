package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;
	
	private By username=By.id("username");
    
	private By password=By.xpath("//*[@id=\"password\"]");
	
	private By login=By.id("Login");
	
	private By TryForFree=By.id("signup_link");
	
	public LoginPageObject(WebDriver driver2)
	{ this.driver=driver2;
		}
   
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLOgin()
	{
		return driver.findElement(login);
	}
	
	public WebElement ClickOnTryForFree()
	{
		return driver.findElement(TryForFree);
	}
	
}
