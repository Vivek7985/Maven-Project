package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Smallpartss {
   
	@Test
	public void SmallPArtss() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/in/iphone/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//For SS we have to required this method.
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		//Finding small part for which we have to take SS.
		File source=driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div[1]/div[1]/div")).getScreenshotAs(OutputType.FILE);
		System.out.println("Detect");
		
		//Path Where we have to save SS. 
		File destination=new File("C:\\Users\\salev\\Documents\\WebPage Screenshot\\.png");
	    System.out.println("Done1");
	    
	    //Copy SS in folder.
		FileUtils.copyFile(source, destination);
		
		System.out.println("Done");
		
		driver.quit();
	}
}
