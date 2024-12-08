package Stepdef1;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatable {
	@Given("^I want precondition$")
	public void run() {
		System.out.println("this is 1st step of 1st scenario");
		//throw new io.cucumber.java.PendingException();
	}
	@And("^some other precondition$")
	public void run2() {
		System.out.println("this is 2nd step of 1st scenario");
	}
	@When("^I complete action$")
		public void run3() {
		System.out.println("this is 3rd step of 1st scenario");
		}
		@And("^some other action$")
		public void run4() {
			System.out.println("this is 4th step of 1st scenario");
		}
			
		@And("^yet another action$")
		public void run5() {
			System.out.println("this is 5th step of 1st scenario");
		}
		@Then("I validate the outcomes")
		public void run6() {
		System.out.println("I validate the outcomes");
		
		}
		@And("^check more outcomes$")
		public void run7() {
			System.out.println("validate outcomes");
		}	

		@Given("I have a data table with the following values")
		  public void i_have_a_data_table_with_the_following_values(DataTable dataTable) {
		    // Get the data from the data table
		    List<List<String>> rows = dataTable.asLists(String.class);

		    // Print out the data
		    for (List<String> row : rows) {
		      System.out.println("Name: " + row.get(0));
		      System.out.println("Age: " + row.get(1));
		      System.out.println("Occupation: " + row.get(2));
		    }
		  }

		  @When("I perform some action")
		  public void i_perform_some_action() {
		    // Perform some action
		    System.out.println("Performing some action...");
		  }

		  @Then("I should see the result")
		  public void i_should_see_the_result() {
		    // Verify the result
		    System.out.println("Expected result...");
		  }

}
