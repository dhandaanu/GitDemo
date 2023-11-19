package stepdefinitions;

import PageObject.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
      Login login = new Login();
      

	@Given("user is on login page")
	public void user_is_on_login_page() {
	
		login.openHomePage();
		login.signIn();
	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clickLogin();
	}
	
	@Then("Login success window should be displayed")
	public void login_success_window_should_be_displayed() {
		login.getSucessmsg();
	}
	
	@Then("Error message displayed")
	public void error_message_displayed() {
		
		login.getErrMsgUN();
	}

	@Then("Invalid username error")
	public void invalid_username_error() {
		login.getErrMsgInvaludUN();
	}
	
	@Then("Invalid password error")
	public void invalid_password_error() {
		login.getErrMsgInvaliedpass();
	}
	@Given("user is on login page with valid creds")
	public void user_is_on_login_page_with_valid_creds() {
		login.signIn();
	}

	@When("user enter (.*) and (.*)$")
	public void user_valid_enter(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    login.clickLogin();
	}
	
	@Then("successfullyLogin success window should be displayed")
	public void successfully_login_success_window_should_be_displayed() {
		login.getSucessmsg();
	}

//	@And("user clicks Sign Out button")
//	public void user_clicks_sign_out_button() {
//		login.signOut();
//	}

}