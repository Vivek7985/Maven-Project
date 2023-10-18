package Amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazonpro {

	public static WebDriver driver;
	
	private By All=By.xpath("//*[@id=\"nav-hamburger-menu\"]/i");
	
	private By Electronics=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a");

    private By Accessories=By.xpath("//*[@id=\"hmenu-content\"]/ul[33]/li[3]/a");
    
    private By MagSafecharger=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[3]/div[1]/h2/a");
    
    private By Addtocart=By.xpath("//*[@id=\"submit.add-to-cart\"]");
    
    
    public Amazonpro(WebDriver driver2)
    {
    	this.driver=driver2;
    }
    
    public WebElement All()
    {
    	return driver.findElement(All);
    }
    
    public WebElement Electronics()
    {
    	return driver.findElement(Electronics);
    }
    
    public WebElement Accessories() {
		return driver.findElement(Accessories);
    }
    
    public WebElement MagSafecharger() {
		return driver.findElement(MagSafecharger);
    }
    
    public WebElement AdtoCart() {
		return driver.findElement(Addtocart);
    }
    

}
