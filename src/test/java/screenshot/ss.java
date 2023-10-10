package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ss {

	@Test
public void Capturingss() throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.apple.com/in/store?afid=p238%7CspzIDw8X2-dc_mtid_187079nc38483_pcrid_675854722735_pgrid_112258962387_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//For SS we have to create this method
	TakesScreenshot SS=(TakesScreenshot)driver;
	
	//For saving File.
	File src=SS.getScreenshotAs(OutputType.FILE);
	
	//Folder where we have to save SS.
	File destination=new File("C:\\Users\\salev\\Documents\\WebPage Screenshot\\.png");
	
	//copy SS in given Folder.
	FileUtils.copyFile(src, destination);
	
	System.out.println("Done");
	
	driver.quit();
}
		
	}
