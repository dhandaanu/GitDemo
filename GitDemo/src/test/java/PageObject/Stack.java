package PageObject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Stack {
	 static WebDriver driver ; 

	public void openHomePage() {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/home");
	 }

	public void validateLogin() {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("NinjaCoders");
		WebElement pword = driver.findElement(By.name("password"));
		pword.sendKeys("SDET135batch");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}

	public void stackStartBtn() {
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a")).click();
	}

	public void onStackPage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Stack";
		Assert.assertEquals(actualTitle, expectedTitle, "Condition true");
	}
	
	public void onStackPageAssert() {
		Assert.assertTrue(driver.findElements(By.xpath("//h4[text()='Stack']")).size()>0, "The user is on Stack page");
	}
	

	public void operationStack() {
		driver.findElement(By.xpath("//a[text()='Operations in Stack']")).click();
	}

	public void navigate() {
		driver.navigate().back();
	}

	public void tryHere() {
		driver.findElement(By.xpath("//a[text()='Try here>>>']")).click();
	}

	public void onTryeditorpage() {
    	String actualTitleTE = driver.getTitle(); // TODO: get actual title
    	//System.out.println("title:" +actualTitleTE);
    	String expectedTitleTE = "Assessment";
    	Assert.assertEquals(actualTitleTE, expectedTitleTE, "Condition true");
    }
}
