package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utilities.Helper;

public class stack {
	
	 static WebDriver driver ; 
	 
	 public void OpenHomePage() {
			
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dsportalapp.herokuapp.com/home");
	 }
	
	public void ValidLogin() {
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("NinjaCoders");
		WebElement pword = driver.findElement(By.name("password"));
		pword.sendKeys("SDET135batch");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	
	public void StackStartBtn() {
	
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a")).click();
		//Helper.GetStartedbttn();
}
	public void Onstackpage() {

		String actualTitle = driver.getTitle();
		//System.out.println("title:" +actualTitle);
		String expectedTitle = "Stack";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
		}
	public void OperationStack() {
		
		driver.findElement(By.xpath("//a[text()='Operations in Stack']")).click();
		///html/body/div[2]/ul[1]/a
		
	}
	public void TryHere() {
		
		driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();
	}
	
	//html/body/div[2]/div/div[2]/a
}
