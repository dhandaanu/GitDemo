package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetstartStepDefinition {
	
	        static WebDriver driver; 
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	    
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dsportalapp.herokuapp.com/");
	
		throw new io.cucumber.java.PendingException();
		
	    }

	@And("clicks the Get Start button")
	public void clicks_the_button() {
	    
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		 
		
	}
			

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
		Assert.assertTrue(driver.findElements(By.xpath("/html/body/div[1]/nav/a")).size()>0, "The user is redirected to homepage");
	    
		throw new io.cucumber.java.PendingException();
		
	}

	@And("The user clicks DataStructure drop down")
	public void the_user_clicks_drop_down(String string) {
	    
		WebElement datastructure = driver.findElement(By.xpath("//a[@class ='nav-link dropdown-toggle']"));
		datastructure.click();

	}

	
	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	    
		
        
		
	} 
	

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}




}
