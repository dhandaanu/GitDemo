package stepdefinitions;

import PageObject.HomePageCards;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageCardStepdefinition {
	
	HomePageCards card = new HomePageCards();
	
	
	@Given("User Open Home Page")
	public void user_open_home_page() {
	     
		card.homePg();
		
	}

	@When("clicks on the Get Started button Data Structure Introduction")
	public void clicks_on_the_get_started_button_data_structure_introduction() {
		
		card.dsinduction();
	    
	}

	@Then("DS alert with a message You are not logged in")
	public void ds_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	    
	}
	
	
	@Given("User Open Home Page linked list")
	public void User_Open_Home_Page_linked_list() {
	     
		card.numpyNinja();
		
	}

	@When("clicks on the Get Started button Linked List")
	public void clicks_on_the_get_started_button_Linked_List() {
		
		card.linkList();
	    
	}

	@Then("Linked List alert with a message You are not logged in")
	public void Linked_List_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	    
	}
	
	

	@Given("User Open Home Page Stack")
	public void User_Open_Home_Page_Stack () {
		 
		card.numpyNinja();
	}
	
	@When("clicks on the Get Started button Stack")
	public void clicks_on_the_Get_Started_button_Stack() {
		
		card.stack();
		
	}

	@Then("Stack alert with a message You are not logged in")
	public void Stack_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	}

	
	@Given("User Open Home Page Array")
	public void User_Open_Home_Page_Array() {
		 
		card.numpyNinja();
	}
	
	@When("clicks on the Get Started button Array")
	public void clicks_on_the_Get_Started_button_Array() {
		
		card.array();
		
	}

	@Then("Array alert with a message You are not logged in")
	public void Array_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	}
	
	
	@Given("User Open Home Page Queue")
	public void User_Open_Home_Page_Queue() {
		 
		card.numpyNinja();
	}
	
	@When("clicks on the Get Started button Queue")
	public void clicks_on_the_Get_Started_button_Queue() {
		
		card.queue();
		
	}

	@Then("Queue alert with a message You are not logged in")
	public void Queue_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	}
	
	
	@Given("User Open Home Page Tree")
	public void User_Open_Home_Page_Tree () {
		 
		card.numpyNinja();
	}
	
	@When("clicks on the Get Started button Tree")
	public void clicks_on_the_Get_Started_button_Tree() {
		
		card.tree();
		
	}

	@Then("Tree alert with a message You are not logged in")
	public void Tree_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
	}
	
	
	@Given("User Open Home Page Graph")
	public void User_Open_Home_Page_Graph () {
		 
		card.numpyNinja();
	}
	
	@When("clicks on the Get Started button Graph")
	public void clicks_on_the_Get_Started_button_Graph() {
		
		card.graph();
		
	}

	@Then("Graph alert with a message You are not logged in")
	public void Graph_alert_with_a_message_you_are_not_logged_in() {
		
		card.alertAssert();
		
	}



}
