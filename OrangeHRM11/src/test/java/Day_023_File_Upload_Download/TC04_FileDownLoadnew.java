package  Day_023_File_Upload_Download;
import org.openqa.selenium.By;	

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class TC04_FileDownLoadnew
{
	static WebDriver driver;
	 
		public String DestinationFile;
		
		//public  int iRow;
		
		
		// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		    
		    
		    
		    
		    
		}
	 	
	    
	   

	    @Test
		public void File_Download()throws Exception
		  {
			
			//SendKeys
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			//Login
			findElement(By.name("username")).sendKeys("Admin");
			findElement(By.name("password")).sendKeys("admin123");
			findElement(By.xpath("//button[@type='submit']")).click();
			
			//PIM Module
			 findElement(By.linkText("PIM")).click();
			 findElement(By.linkText("Employee List")).click();
			 findElement(By.xpath("//div[text()='0070']")).click();
			 	 
			 findElement(By.xpath("//i[@class='oxd-icon bi-download']")).click();
			 
			 String filename=findElement(By.xpath("//div[text()='Sample.txt']")).getText();
			 
			 String sourcepath="C:\\Users\\mahes\\Downloads\\"+filename;
			 String destipath="C:\\Mydownload\\"+filename;
			 
		   	Thread.sleep(6000);
			 moveFile(sourcepath, destipath);

		        
			 	 
		  }	 	 
			 	 
	
	    public static void moveFile(String src, String dest ) throws InterruptedException {
	        Path result = null;
	        try {
	           result =  Files.move(Paths.get(src), Paths.get(dest));
	           
	           
	           Thread.sleep(5000);
	        }
	        catch (IOException e)
	        {
	           System.out.println("Exception while moving file: " + e.getMessage());
	        }
	        if(result != null)
	        {
	           System.out.println("File moved successfully.");
	        }
	        else
	        {
	           System.out.println("File movement failed.");
	        }  
	     }
	    
	
		
	
	}