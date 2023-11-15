package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage {
	
	 static WebDriver driver; 
	 
	
	public void dsAlgo() {
	
	        driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://dsportalapp.herokuapp.com/");
			
	}
	
	public void getStarted() {
		
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	
	}
	
	public void homePage() {
		
		Assert.assertTrue(driver.findElements(By.xpath("/html/body/div[1]/nav/a")).size()>0, "The user is redirected to homepage");
	
	}
	
	
	public void dropdown() {
		
		driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']")).click();
	}
	
	
	public void selectList() {
		

    	List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-menu .dropdown-item"));
    	
    	
    	for (WebElement element : elements) {
    	if ("Stack".equals(element.getText())) {
    			element.click();
    			break;
    		} else {
    			continue;
    		}
		
	     }
	
    }
	
	public void alertLog() {
		
		  System.err.println("=====" + driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText());
		  	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText(), "You are not logged in");
	
//	public WebDriver getDriverFromHP() {
//		return driver;
	}
	
	public void homepg()
	{
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	public void getStartbtn()
	{
	 driver.findElement(By.xpath("//a[text()=''Get Started']")).click();

	 
	}
}


