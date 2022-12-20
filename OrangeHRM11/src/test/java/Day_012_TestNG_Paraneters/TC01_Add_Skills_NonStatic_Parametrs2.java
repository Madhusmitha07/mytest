package Day_012_TestNG_Paraneters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Skills_NonStatic_Parametrs2 {
	
	
	//Step1 delcaration of webdriver
	WebDriver driver;
	
	//Step2 - Declaration of Global Variables
	
	
	
  @Parameters({"browser","url","username","password","skillname","skilldesc"})
  @Test
  public void SkilsTest(String browser1,String url1,String username1,String password1,String skillname1,String skilldesc) throws Exception {
	  
	  TC01_Add_Skills_NonStatic_Parametrs2 T123=new TC01_Add_Skills_NonStatic_Parametrs2();
	  
	  T123.openBrowser(browser1);
	  T123.OpenOrangeHRM(url1);
	  T123.Login(username1,password1);
	  T123.AddSKills(skillname1,skilldesc);

  }
  
  
  
  public void openBrowser(String browser) throws Exception {
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
				
		driver.manage().window().maximize() ;	
	  }
	  
	  if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe");
			driver =new FirefoxDriver();
					
			driver.manage().window().maximize() ;	
	  }
  }
  
  
  public void OpenOrangeHRM(String TestURL) throws Exception {
	  
		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  public void Login(String UserName,String Password) throws Exception {
	  
		//Login
		findElement(By.name("username")).sendKeys(UserName);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  public void AddSKills(String SkillName,String SkillDescr) throws Exception {
	  
	//AddSkills
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		Thread.sleep(5000);
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		Thread.sleep(5000);
		findElement(By.xpath("//a[text()='Skills']")).click();
		Thread.sleep(5000);
		findElement(By.xpath("//button[text()=' Add ']")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
		findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr);
		Thread.sleep(5000);
		findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.quit();
	  
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
