package stepdefinitions;

import PageObject.stack;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stackDefinition {
	
	stack s = new stack();
	
	
	@Given("User is logged in and on Home Page")
	public void user_is_logged_in_and_on_home_page() {
		
	    s.OpenHomePage();
		s.ValidLogin();
		
		
	}

	@When("User clicks on stack Get started button")
	public void user_clicks_on_stack_get_started_button() {
		s.StackStartBtn();
	}

	@Then("User is on stack Intro page")
	public void user_is_on_stack_intro_page() {
		 s.Onstackpage();
	}


	@And("User clicks on operation in stack")
	public void User_clicks_on_operatio_n_stack() {
		s.OperationStack();
		
	}
	
	@And(" And user clicks on try here")
	public void  And_user_clicks_on_try_here() {
		
		
	}
}
