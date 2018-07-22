package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import FacebookRegClasses.Registration;
public class FacebookReg extends LoadFaceBookProperties{
	
	WebDriver dr;
	LoadFaceBookProperties PLoad;
	Registration Reg;
	
	
	@Given("^user registration page$")
	public void user_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver", "F:\\Selenium class\\Autoit Editor\\chromedriver_win32\\chromedriver.exe");
		    dr = new ChromeDriver();
		    PLoad = new LoadFaceBookProperties(); 
		    PLoad.loadproperties();
		    System.out.println(P.getProperty("URL"));
		    Reg.NavigateToURL(dr, P.getProperty("URL"));
	}
	
	@Given("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    Reg.EnterData(dr, "xpath", P.getProperty("Email"), arg1);
	    Reg.EnterData(dr, "xpath", P.getProperty("Password"), arg2);
	}

	@Given("^I press login$")
	public void I_press_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Reg.ClickButton(dr,"xpath",P.getProperty("SignUpButton"));
	}
}
