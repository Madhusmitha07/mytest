package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.testng.annotations.*;

public class TC01_id
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		
		driver.get("https://www.facebook.com/");
		
		//findElement(By.id("email")).sendKeys("8142554433");
		//findElement(By.name("pass")).sendKeys(null);
		
		findElement(By.xpath("//*[@id='email']")).sendKeys("8142554433");
		
		
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











