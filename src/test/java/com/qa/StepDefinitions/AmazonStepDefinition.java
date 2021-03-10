package com.qa.StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.AmazonPages;
import com.qa.pages.RediffPages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinition {

	WebDriver Driver;
	AmazonPages AmazonOR;
	String SearchTerm = "Da vinci code";
	Actions act;
	
	
	/*
	 * @Before public void setUp() { WebDriverManager.chromedriver().setup();
	 * Driver= new ChromeDriver(); AmazonOR = new AmazonPages(Driver);
	 * 
	 * act = new Actions(Driver); }
	 * 
	 * @After public void tearDown() {
	 * System.out.println("***** Test Ends Here *****"); }
	 */


	@Given("^the user is on Amazon page$")
	public void the_user_is_on_Amazon_page(){
		
			
		Driver.get("https://www.amazon.in/");
	}

	@When("^the title of page has Amazon$")
	public void the_title_of_page_has_Amazon() {
		String title = Driver.getTitle();
		Assert.assertTrue(title.contains("Amazon"));
	}

	@Given("^the user should select Books as Category$")
	public void the_user_should_select_Books_as_Category() {
		AmazonOR.setCategoryInput("Books");
	}

	@Then("^Enter Da vinci code in search text box$")
	public void enter_Da_vinci_code_in_search_text_box() {
		AmazonOR.setSearchTextBoxInput(SearchTerm);
	}

	@Then("^click the magnifier button$")
	public void click_the_magnifier_button(){
		AmazonOR.setMaginifierBtnClick();
	}

	@Then("^check if all the items are loaded$")
	public void check_if_all_the_items_are_loaded() {
		List<WebElement> itemNames = AmazonOR.getItemNames();
		for(WebElement ele : itemNames) {
			System.out.println(ele.getText());
		}
	}

	@Then("^the title should have search term$")
	public void the_title_should_have_search_term(){
		boolean contains = Driver.getTitle().contains(SearchTerm);

		Assert.assertTrue(contains);
	}


	@Then("^close the browser$")
	public void close_the_browser() {
		Driver.close();
	}

	@Given("^the user does Mouse over on account and list$")
	public void the_user_does_Mouse_over_on_account_and_list() {
		WebElement ele = AmazonOR.getAccountList();
		
		act.moveToElement(ele).build().perform();	

	}

	@Then("^click start here link$")
	public void click_start_here_link() {
		AmazonOR.setstartHereLinkClick();
	}

	@Then("^the user should be landed on registration page$")
	public void the_user_should_be_landed_on_registration_page() {
		boolean contains = Driver.getTitle().contains("Registration");

		Assert.assertTrue(contains);
	}

}
