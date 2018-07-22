package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario1 {

	WebDriver dr;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium class\\Autoit Editor\\chromedriver_win32\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://mail.rediff.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.linkText("Sign in")).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath(".//*[@id='login1']")).sendKeys("abc");
		dr.findElement(By.xpath(".//*[@id='password']")).sendKeys("Password1");
		dr.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 String message=dr.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[5]")).getText();
	 if(message.equals("Wrong username and password combination."))
	 {
		 System.out.println("successfull");
	 }
	}
	
	@When("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.quit();
	}

}
