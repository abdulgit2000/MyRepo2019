package com.pftc.cucumber.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDef {
	
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new InternetExplorerDriver();
	
	@Given("User Navigate to Facebook Login Page")
	public void user_Navigate_to_Facebook_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "/src/test/resources/drivers/geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "/src/test/resources/drivers/IEDriverServer.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		//driver.quit();
	}

	@When("User fill up all the required information for Sign Up")
	public void user_fill_up_all_the_required_information_for_Sign_Up() {
	   
	}

	@Then("User Click on Sign UP button")
	public void user_Click_on_Sign_UP_button() {
	   
	}

	@And("User verify the Successful Sign Up message")
	public void user_verify_the_Successful_Sign_Up_message() {
	   
	}
	
	
	@When("User enter valid Credentials")
	public void user_enter_valid_Credentials() {
	    
	}

	@Then("User Click on Sign In Button")
	public void user_Click_on_Sign_In_Button() {
	   
	}
	
	
	
}
