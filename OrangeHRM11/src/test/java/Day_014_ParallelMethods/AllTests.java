package  Day_014_ParallelMethods;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class AllTests
{
	
	
	
	
	@Test
	public void TC01_Add_Nationalities() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		
		driver.quit();
	}
	
	
	@Test
	public void TC01_Add_Jobs() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("http://google.co.in");

		//SendKeys
		
		
		//Close Browser		
		driver.quit();
	}
	
	
	
	
	
}                                                  












