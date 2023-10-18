package Finalproject.MavFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {

	@Test
	public void name2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.imdb.com/title/tt2084970/");
		driver.manage().window().maximize();
		System.out.println("open succesfully");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Final done");
        driver.quit();
	}
}


