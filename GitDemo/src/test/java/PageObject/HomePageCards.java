package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePageCards {
	
	static WebDriver driver   ; 

	
	public void homePg() {
		
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dsportalapp.herokuapp.com/home");

}
	
	public void numpyNinja() {
		
		driver.navigate().refresh();  
		
		}
	
	
     
    public void alertAssert() {

    System.err.println("=====" + driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText());
    Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText(), "You are not logged in");
        }
	
     

	public void dsinduction()
	{
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/a")).click();
		
	}
	
	public void linkList() {
	
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/a")).click();
		
	}
	
	public void stack() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a")).click();
		
	}
	
	public void array() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a")).click();
		
	}
	
	public void queue() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a")).click();
		
	}
	
	public void tree() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[6]/div/div/a")).click();
	}
	
	public void graph() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div/a")).click();
		
		
	}
	
}