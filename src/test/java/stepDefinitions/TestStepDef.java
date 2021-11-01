package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DearlerPageObject;

public class TestStepDef extends Base{
	
	DearlerPageObject Dealer = new DearlerPageObject();
	
	@Given("user is on hotel website")
	public void user_is_on_hotel_website() {
	String actualTitle = driver.getTitle();
	String expectedTitle = properties.getProperty("title");
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle + " is equal to " + expectedTitle);
	}
	
	@When("user click on signIn button")
	public void user_click_on_sign_in_button() {
		Dealer.clickSignIn();
	logger.info("user click on signIn button");
	
	}
	
	@Then("user should see signIn page")
	public void user_should_see_signIn_page() {
		Assert.assertTrue(Dealer.isAuthenticationDisplayed());
		Assert.assertTrue(Dealer.isEmailPresent());
		logger.info("sign in page is displayed");
	}
	
	
	

}
