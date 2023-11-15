package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class GetstartStepdefinition {
	
	WebDriver driver;
	HomePage fromhomePage;
	
//	 static WebDriver driver; 
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	   
		fromhomePage = new HomePage();
		fromhomePage.dsAlgo();}

	@When("clicks the Get Started button")
	public void clicks_the_get_started_button() {
		fromhomePage = new HomePage();
	    fromhomePage.getStarted();
	   } 
	   
	

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	    
		fromhomePage = new HomePage();
	    fromhomePage.homePage();
	     } 
		
	    
	
	

     @Given("The user clicks Data Structures drop down")
     public void the_user_clicks_Data_Structure_drop_down() {
   
    	fromhomePage = new HomePage();
	    fromhomePage.dropdown();
 		  
         }

    @When("selects any data structures item from list")
   public void selects_any_data_structures_item_from_list() {
    	fromhomePage = new HomePage();
	    fromhomePage.selectList();
   
    	
    }
    
   
    
    	
    @Then("alert msg without sign - You are not logged in")
    public void alert_msg_without_sign_You_are_not_logged_in() {
   
    	fromhomePage = new HomePage();
	    fromhomePage.alertLog();
   
   
    }
    
    @Given("User Open Home Page")
    public void  User_Open_Home_Page() {
    	fromhomePage = new HomePage();
	    fromhomePage.homepg();
   
    }
    	
  //  }
    
    @When("clicks on any of the Get Started button")
    public void clicks_on_any_of_the_Get_Started_button() {
    	
    //	fromhomePage = new HomePage();
	 //   fromhomePage.getStartbtn();
    //	
    	
    }
    
    	
    @Then( "alert with a message You are not logged in")
    public void alert_with_a_message_You_are_not_logged_in()
    {
    	
    	
    }
    




}
