package Day_012_TestNG_Paraneters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

//import ExcelUtil.ExcelApiTest4;


public class TC02_Login_Static_Paarameters1 {
	
	
	static WebDriver driver;
	
	
 
	@Parameters({"Browser1","UserName1","Password1","Nationality1"})//Stpe2
	@Test
	public void Login_Test(String Browser,String UserName,String Password,String Nationality) throws Exception//Step2
	{
		
	
				if(Browser.equalsIgnoreCase("Chrome"))
					{
						
					   driver=TestBrowser.OpenChromeBrowser();
					   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
				    }

					if(Browser.equalsIgnoreCase("FireFox"))
					{
							driver = TestBrowser.FirefoxBrowser();
							Thread.sleep(5000);
							  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
					}
						
	
	   // TC02_Login_Static_Paarameters1.OpenChromeBrowser();
		TC02_Login_Static_Paarameters1.OpenOrangeHRM();
		TC02_Login_Static_Paarameters1.Login(UserName,Password);
		TC02_Login_Static_Paarameters1.AddNationalities(Nationality);
	
		driver.quit();
	}
	
	
	
	
	public static  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
 
	
	
	
	
	
	public static void OpenOrangeHRM() throws Exception
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	public static void Login(String UserName,String Password) throws Exception
	{
		
		//Login
				findElement(By.name("username")).sendKeys(UserName);
				findElement(By.name("password")).sendKeys(Password);
				findElement(By.xpath("//button[@type='submit']")).click();
				
				
		
		
	}
	
	
	public static   void AddNationalities(String Nationality) throws Exception
	{
		//AddNationality
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nationality);
		
		Thread.sleep(5000);
		findElement(By.xpath("//button[text()=' Save ']")).click();
		
		 
			
		
		
	}
	
	
	
	
	
	

}
