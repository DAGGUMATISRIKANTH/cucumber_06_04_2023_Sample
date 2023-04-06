package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	 @Given("^user is on Netbanking landing page$")
	 public void user_is_on_Netbanking_landing_page() throws Throwable
	 {
		 System.out.println("user is on netbanking");
	 }
	 @When("^user logging into application with username and password$")
	 public void user_logging_into_application_with_username_and_password() throws Throwable
	 {
		 System.out.println("Loging with username & password");
	 }
	 
	 @Then("^home page is populated$")
	 public void home_page_is_populated() throws Throwable
	 {
		 System.out.println("home page landed");
	 }
	 
	 @And("^cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }
       @When("^user logging into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_logging_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	    {
		 System.out.println(strArg1);
         System.out.println(strArg2);
	    }
       @When("^user signup with following details")
       public void user_signup_with_following_details(DataTable data)
      {
    	   List<List<String>> obj=data.asLists();
    	   System.out.println(obj.get(0).get(0));
    	   System.out.println(obj.get(0).get(1));
    	   System.out.println(obj.get(0).get(2));
    	   System.out.println(obj.get(0).get(3));
       }
       @When("^user log into application with (.+) and (.+)$")
       public void user_log_into_application_with_and(String username, String password) throws Throwable 
       {
           System.out.println(username);
           System.out.println(password);
       }
  
       
       
       @Given("^validate the browser$")
       public void validate_the_browser() throws Throwable 
       {
    	   System.out.println("validating the browser first");
       }

       @When("^browser is triggered$")
       public void browser_is_triggered() throws Throwable 
       {
    	   System.out.println("Browser is triggered in background");
       }

       @Then("^check if browser gets started$")
       public void check_if_browser_gets_started() throws Throwable 
       {
    	   System.out.println("Browser launching in background");
       }

       
}
