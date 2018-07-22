package StepDefination;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FacebookRegParameterTestCases {
	@Given("^user registration page and the following todos exist:$")
	public void user_registration_page_and_the_following_todos_exist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Enter value in \"([^\"]*)\"$")
	public void enter_value_in(String arg1, DataTable arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    System.out.println("------------"+arg1+"------------------");
	    System.out.println("------------"+arg2+"------------------");
	}
}
