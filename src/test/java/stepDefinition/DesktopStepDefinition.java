package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.DesktopPageObject;

public class DesktopStepDefinition extends Base {
	
	DesktopPageObject obj = new DesktopPageObject();

	@Given("^User is on Retail website")
	public void user_is_on_retail_website() {
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "TEK SCHOOL";
	    
	    Assert.assertEquals(actualTitle, expectedTitle);
	    logger.info("Actual title is matching expected title");
	   
	}
	@When("^User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	   obj.desktopClick();
	   logger.info("user clicked desktop menu");
	}
	@And("^User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    obj.showAllDesktopClick();
	    logger.info("User clicked on show all desktops menu");
	    //screenshot
	}
	@Then("^User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    
	    Assert.assertTrue(obj.DesktopsTextPresent());
	    logger.info("Desktop text present");
	    
	    Assert.assertTrue(obj.isDektopImgPresent());
	    logger.info("Desktop image is present in the page");
	    
	    Assert.assertTrue(obj.exampleTxtVerification());
	    logger.info("Example of category description text is present");
	    
	    Assert.assertTrue(obj.refinesearchTxt());
	    logger.info("Refine Search text is present");
	    
	    Assert.assertTrue(obj.listButtonDisplayed());
	    logger.info("list icon is present");
	    
	    Assert.assertTrue(obj.gridButtonDisplayed());
	    logger.info("Gird icon is present");	    
	   
	}
	
	@And("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    obj.HPLPAddToCart();
	    logger.info("User clicked on add to cart option");
	}

	@And("^User select quantity (.+)$")
	public void user_select_quantity(String quantity) {
	    obj.enterQuantity(quantity);
	    logger.info("user entered value "+ quantity +"  in the text box");
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    obj.clickAddToCart();
	    logger.info("user clicked on Add To Cart button");
	}

//	@Then("User should see a message (.+)’")
//	public void user_should_see_a_message(String msg) {
//		
//		String actualMsg = obj.successMessge();
//		String expectedMsg = msg;
//		Assert.assertEquals(actualMsg, expectedMsg);
//		logger.info("Actual success message matches expected success message");
//	}

	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	
	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    obj.clickCanonAddToCart();
	    logger.info("User clicked on Canon Add to Cart Button");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	    obj.selectDropdown();
	    obj.selectRedColor();
	    
	    logger.info("User selected Red Color from the dropdown list");
	}
	
	@And("^User selects quantity '(.+)'$")
	public void User_select_quantity(String num) {
		obj.quantityAdd(num);
		logger.info("User selected "+ num );
	}
	
	@And("User clicks add to Cart button")
	public void User_click_add_to_Cart_button() {
		obj.clickAddToCartButton();
		logger.info("User clicked on add to cart button");
	}

	@Then("^Then User should see a message '(.+)'$")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart(String msg) {
		
//		String actual = ;
//		String expected = ;
//		
//	    Assert.assertTrue(obj.isSuccessMsgDisplayed());
	}
	
	//Scenario: User add a review to Canon EOS 5D item in Desktops tab

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    obj.clickOnCanon();
	    logger.info("User clicked on Canon Add to Cart Button");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		obj.writeReviewClick();
		logger.info("User clicked on write a review link");
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dt) {

		List<Map<String, String>> info = dt.asMaps(String.class, String.class);
		
		obj.enterName(info.get(0).get("yourname"));
		obj.writeYourReview(info.get(0).get("yourReview"));
		obj.reviewRating(info.get(0).get("Rating"));
		
		logger.info("information passed");
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		obj.clickContinue();
		logger.info("User clicked on Continue Button");
	}
	


	@Then("^User should see a message with '(.+)'$")
	public void user_should_see_a_message_with(String successMesg) {

		//Base.explicitWait(obj.successMessageElement(), 30);
		String actualMsg = obj.reviewSuccess();
		String expectedMsg = successMesg;
		
		Assert.assertEquals(actualMsg, expectedMsg);
		logger.info("Actual success message matches expected message");
		
		
	}	
	
}
