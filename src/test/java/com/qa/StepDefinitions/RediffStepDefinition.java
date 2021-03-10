package com.qa.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RediffPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffStepDefinition {
	
	
	WebDriver Driver;
	RediffPages RediffOR;
	
	
	
	
	@Given("^the user is on Rediff Home page$")
	public void the_user_is_on_Rediff_Home_page() {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		RediffOR = new RediffPages(Driver);
		Driver.get("https://www.rediff.com/");
		
	}

	@Given("^the user click on signin link$")
	public void the_user_click_on_signin_link() {
		RediffOR.setSignInLinkClick();
		
	}

	@Then("^enter user name \"([^\"]*)\"$")
	public void enter_user_name(String Uname) {
		RediffOR.setUNameTextBoxInput(Uname);
	}

	@Then("^enter password \"([^\"]*)\"$")
	public void enter_password(String Password) {
		RediffOR.setPwdTextBoxInput(Password);
	}

	@Then("^click on signin button$")
	public void click_on_signin_button() {
		RediffOR.setSignInBtnClick();
		
	}

	@Then("^close the current browser$")
	public void close_the_current_browser() {
		Driver.close();
	}

}
