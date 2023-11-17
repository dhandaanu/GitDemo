package stepdefinitions;

import PageObject.Stack;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackDefinition {
	
	Stack stack = new Stack();

	/**
	 * first scenario
	 */
	@Given("User is logged in and on Home Page")
	public void user_is_logged_in_and_on_home_page() {
		stack.openHomePage();
		stack.validateLogin();
	}

	@When("User clicks on stack Get started button")
	public void user_clicks_on_stack_get_started_button() {
		stack.stackStartBtn();
	}

	@Then("User is on stack Intro page")
	public void user_is_on_stack_intro_page() {
		stack.onStackPage();
	}

	@Given("User is on opertaion stack Intro page")
	public void user_is_on_opertaion_stack_intro_page() {
		stack.onStackPageAssert();
	}

	@When("user clicks on opertaion in stack")
	public void user_clicks_on_opertaion_in_stack() {
		stack.operationStack();
	}

	 @And("User clicks on try here")
	 public void  And_User_clicks_on_try_here() {
		 stack.tryHere();
	 }

	@Then("User lands on tryEditor page")
	public void user_lands_on_try_editor_page() {
		stack.onTryeditorpage();
	}
}