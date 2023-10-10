package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public void driverinitialize() throws IOException {
		
		//Here we gave path of data.proprties File.
		FileInputStream fis=new FileInputStream("C:\\Users\\salev\\eclipse-workspace\\MavFinal\\src\\main\\java\\resources\\data.properties");
	    
		//To load properties.
		Properties prop=new Properties();
		prop.load(fis);
		
		//Create string to Store browser.
		String browserName=prop.getProperty("browser");
		
		//if else statement for cross browser testing.
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		else {
			System.out.println("You dont have a appropriate browser");
		}
	}
}
