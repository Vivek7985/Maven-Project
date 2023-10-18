package Amazonpro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Amazonproject.Amazonpro;
import resources.BaseClass;

public class project extends BaseClass{

@Test
	public void pro() throws IOException, InterruptedException {
		driverinitialize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Amazonpro obj=new Amazonpro(driver);
		
		obj.All().click();
		Thread.sleep(2000);
		
		obj.Electronics().click();
		Thread.sleep(2000);
		
		obj.Accessories().click();
		Thread.sleep(2000);
		
		obj.MagSafecharger().click();
		Thread.sleep(2000);
		
		obj.AdtoCart().click();
		Thread.sleep(3000);
	
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\salev\\Documents\\WebPage Screenshot\\.png");
		FileUtils.copyFile(src, destination);
		
		System.out.println("PROJECT DONE");
	    driver.quit();
	}
}
