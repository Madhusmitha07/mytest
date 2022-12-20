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

public class TC01_Add_jobs_NonStatic_Parameters {
	
	WebDriver driver;
	
	//Step2 - Declaration of Global Variables
	//String TestURL="https://opensource-demo.orangehrmlive.com/";
	//String UserName="Admin",PassWord="admin123";
	//String JobTitle="Sales11",JobDescr="Sales11 descr",JobNote="Sales11 Note";
	
	@Parameters({"browser","url","username","password","jobtitle","jobdesc","jobnote"})
  @Test
  public void JobsTest(String browser1,String testurl,String username1,String password1,String jobtitle1,String jobdesc1,String jobnote1) throws Exception {
	  
	
	  TC01_Add_jobs_NonStatic_Parameters T1=new TC01_Add_jobs_NonStatic_Parameters();
	  T1.openBrowser(browser1);
	  T1.OpenOrangeHRM(testurl); //step 3- Passing Global Variables 
	  T1.Login(username1,password1);//step 3- Passing Global Variables 
	  T1.AddJobs(jobtitle1,jobdesc1,jobnote1);//step 3- Passing Global Variables 
		
		
  }
  
  
  public void openBrowser(String browser) throws Exception
  {
	  if(browser.equalsIgnoreCase("chrome"))
	    {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();			
			driver.manage().window().maximize() ;	
			
		
	    } 
	  
	  if(browser.equalsIgnoreCase("firefox"))
	    {
		  System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize() ;
		  
	    }
  }
  
  public void OpenOrangeHRM(String TestURL) throws Exception
  {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.get(TestURL);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
  
  public void Login(String UserName,String PassWord) throws Exception
  {
	//Login
			findElement(By.name("username")).sendKeys(UserName);
			findElement(By.name("password")).sendKeys(PassWord);
			findElement(By.xpath("//button[@type='submit']")).click();
			
  }
  
  public void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception
  {
	//AddJobs
			findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//span[text()='Job ']")).click();
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//a[text()='Job Titles']")).click();
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(JobDescr);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote);
			Thread.sleep(5000);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			findElement(By.xpath("//button[text()=' Save ']")).click();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
