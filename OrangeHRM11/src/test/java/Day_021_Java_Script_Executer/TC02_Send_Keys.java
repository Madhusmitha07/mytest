package  Day_021_Java_Script_Executer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class TC02_Send_Keys 
{		
	
	static WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
       // WebDriver driver= new FirefoxDriver();	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
         driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      	
        		
        //Launching the Site.		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			
      
           		
        //Login to Guru99 
       // WebElement username=driver.findElement(By.name("txtUsername"));
        
        
        //Creating the JavascriptExecutor interface object by Type casting		
        
        
        
        
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
       // WebElement loginbutton =driver.findElement(By.id("btnLogin"));
         
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));

        JavascriptExecutor js1 = (JavascriptExecutor)driver;	
      
        js1.executeScript("arguments[0].setAttribute('value','Admin')", username);
        
        JavascriptExecutor js2 = (JavascriptExecutor)driver;	
        js2.executeScript("arguments[0].setAttribute('value','admin123')", password);
        
       // JavascriptExecutor js3 = (JavascriptExecutor)driver;	
        
        Thread.sleep(2000);
        
        //js3.executeScript("(arguments[0].click());",loginbutton);
        
     //  WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
        
       
       //loginButton.sendKeys(Keys.ENTER);
       
     //  loginButton.click();
       
       //doubleClickWithJS(loginButton);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       
       
       
       /* ((JavascriptExecutor) driver).executeScript("var evt = document.createEvent('MouseEvents');"+ 
        	    "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"+ 
        	    "arguments[0].dispatchEvent(evt);", loginButton);*/
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
                

            // loginbutton.click();
       // WebDriverWait wait=  new WebDriverWait(driver,60);
		 //wait.until(ExpectedConditions.elementToBeClickable(loginbutton)) ;
		
        
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        //js.executeScript("arguments[0].click();", loginbutton);
        //driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
        
      //  findElement(By.id("menu_pim_viewPimModule")).click();
        
       // WebElement pim1 =findElement(By.id("menu_pim_viewPimModule")); 
       // js.executeScript("arguments[0].click();", pim1);
        
       // ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", pim1);
        
        //This  will scroll down the page by  1000 pixel vertical
         // js.executeScript("window.scrollBy(0,200)");
     
    }		
    
    public static void doubleClickWithJS(WebElement element) {
    	   JavascriptExecutor executor = (JavascriptExecutor) driver;
    	   executor.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", element);
    	}
    
    
   /* 
    public  WebElement findElement(By by) throws Exception 
   	{
   				
   		 WebElement elem = driver.findElement(by);    	    
   		
   		 
   		if (driver instanceof JavascriptExecutor) 
   		{
   		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
   	 
   		}
   		
   		return elem;
   	}
    */
       
    
    
    
    
    
    
    
}