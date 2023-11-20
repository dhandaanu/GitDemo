package stepdefinitions;


import PageObject.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegisterStepdefinition {
	 Register register = new Register();
    
    @Given("^The user opens Register Page")
	 public void the_user_opens_register_page() {
     register.registerPage();
     register.registerClick();
	}

	@When("^The user enters (.*), (.*) and (.*)$")
		public void the_user_enters_username_password_confirmpassword(String username, String password, String confirmpassword) {
		register.registerClick();
	    register.sendUserName(username);
		register.sendPassword(password);
		register.sendConfirmation(confirmpassword);
		
    }
   @And("Clicks on register button")
		public void clicks_on_register_button() {
	   register.register();
    }
   
   @Then("User gets instruction")
   public void user_gets_instruction() throws InterruptedException {
	   register.fillOutField();
	  
    }
   @Then("The User gets an error message for password missmatch")
	public void the_user_gets_an_error_message_for_password_missmatch() {
        register.pwdmissMatch();
     }
  }
  