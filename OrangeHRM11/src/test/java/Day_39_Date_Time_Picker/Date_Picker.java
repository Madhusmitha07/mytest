 package Day_39_Date_Time_Picker;
 
 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
 import java.net.MalformedURLException;
 import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import CommonUtil.TestBrowser;

 public class Date_Picker {

	 static WebDriver driver;

		@Test
		public void Test2() throws Exception {
		
			driver = TestBrowser.OpenChromeBrowser();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String TestURL = "https://opensource-demo.orangehrmlive.com/";
			driver.get(TestURL);
			
			
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
			
			findElement(By.linkText("Leave")).click();
			findElement(By.linkText("Leave List")).click();
			
			
			//img[@class='ui-datepicker-trigger'])[1]
			
			driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();
			
			
			
			Select listbox =new Select(driver.findElement(By.className("ui-datepicker-month")));
		 	listbox.selectByVisibleText("Aug");
		 	 
		 	Select listbox0 =new Select(driver.findElement(By.className("ui-datepicker-year")));
		 	listbox0.selectByVisibleText("2022");
		 	 
		 	//*[contains(@href,'#') and text()='10']
			
			//String str2="//*[contains(@href,'#') and text()='" + 25 +"']";
			
		 	
		 	//a[text()='27']
		 	
		 	
	
		 	
			String str3="//a[text()='" + 25 +"']";
			System.out.println(str3);
			
			
			
		 	WebElement date2=findElement(By.xpath(str3));
			
		 	Actions act1 = new Actions(driver);
		 	act1.moveToElement(date2).click().perform();
		 	
		 	//findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[2]/img")).click();
	
			/*Select listbox8 =new Select(driver.findElement(By.className("ui-datepicker-month")));
		 	 listbox8.selectByVisibleText("Mar");
		 	 
		 	Select listbox9=new Select(driver.findElement(By.className("ui-datepicker-year")));
		 	 listbox9.selectByVisibleText("2019");
		 	
		 	String str3="//*[contains(@href,'#') and text()='" + 24 +"']";
		  	WebElement date3=findElement(By.xpath(str3));
		 	act1.moveToElement(date3).click().build().perform();
		 	 act1.moveToElement(date3).click().build().perform();*/
		}
		
		
		

	public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}



 }