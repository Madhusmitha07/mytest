package Day_021_Java_Script_Executer;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_New_Tab {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
    JavascriptExecutor js = (JavascriptExecutor)driver;	

	//below line opens new tab
    js.executeScript("window.open()");
	
	
	
		
	}
	

}
