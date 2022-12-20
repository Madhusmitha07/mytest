package  Day_029_PageObjectModel1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Jobs
{
	
	WebDriver driver;
	
	public void Jobs(WebDriver driver)
	{
		this.driver = driver;
	}
	

	
	public void AddJobs(String JobTitle,String JobDescr,String JobNote) throws Exception {
		
	}
	
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}















