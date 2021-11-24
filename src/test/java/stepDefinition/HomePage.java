package stepDefinition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePageObject;

public class HomePage extends Base {

	HomePageObject obj = new HomePageObject();
	
	@Given("user is on Retail website")
	public void user_is_on_retail_website() {
	
	}
	
	@When("user click on Currency")
	public void user_click_on_currency() {
		obj.clickOnCurrency();
		//logger.info("User clicked on currency");
	}

	@And("user Choose Euro from dropdown")
	public void user_choose_euro_from_dropdown() {
		obj.clickOnEURCurrency();
		logger.info("user clicked on Euro Currency");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(obj.eurDisplay());
		logger.info("Euro Currency is displayed");
	}

	@When("user click on shopping cart")
	public void user_click_on_shopping_cart() {
		obj.clickShopingCart();
		logger.info("User clicked on shopping cart");
	}

	@Then("^'(.+)' message should display$")
	public void message_should_display(String msg) {
		
		String actualMsg = obj.shopingCartMessage();
		String expectedMsg = msg;
		Assert.assertEquals(expectedMsg, actualMsg);
	}

}
