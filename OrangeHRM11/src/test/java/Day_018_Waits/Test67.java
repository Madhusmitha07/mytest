package Day_018_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test67 {
	
	  WebDriver driver;	
	  
  @Test
  public void Tesdt56() {
	  
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	
			
	 WebDriverWait wait=  new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))) ;
	 
	 driver.findElement(By.linkText("Logout")).click();
	
	
	  
  }
}
