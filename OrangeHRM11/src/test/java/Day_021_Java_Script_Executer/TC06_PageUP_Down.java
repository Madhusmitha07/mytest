package  Day_021_Java_Script_Executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC06_PageUP_Down {

    WebDriver driver;
    
    @Test
    public void ByPixel() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("https://www.amazon.in/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();
        
    
        
        //Page Down
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        //Thread.sleep(5000);
        
        //Page Up
        js.executeScript("window.scrollTo(0, document.body.scrollTop)");
        

        
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