package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	static WebDriver driver; 
	
	
	@Given("User is on home page")
		public void user_is_on_home_page() {
	    
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dsportalapp.herokuapp.com/home");
	
		
	   
	}

	@And("clicks on sign in button")
	public void clicks_on_sign_in_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
				
	}

	@When("^User enters valid (.*)and (.*)$")
	public void User_enters_valid_usernameand_password(String username, String password) {
	   
		
		driver.findElement(By.id("id_username")).sendKeys("username");
		driver.findElement(By.id("id_password")).sendKeys("password");
		
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	
	}

	@Then("User is navigated to home page with status you are logged in")
	public void user_is_navigated_to_home_page_with_you_are_logged_in() {
	   
		//driver.findElement(By.xpath("/html/body/div[1]/nav/a"));
		
		
	    
	}

	
	
}
