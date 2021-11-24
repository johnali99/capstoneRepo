package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RetailPageObject;

public class RetailPageMyAccount extends Base {

	RetailPageObject retail = new RetailPageObject();
	
	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
		retail.clickOnMyAccount();
		logger.info("User clicked on my account");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLogin();
		logger.info("User clicked on login");
	}

	@And("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_and_password(String emailValue, String passValue) {
		retail.enterUserNameAndPassword(emailValue, passValue);
		
		logger.info("User entered " + emailValue);
		logger.info("user entered password "+ passValue);
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButton();
		logger.info("User clicked on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retail.myAccountDashboard());
		logger.info("My account dashboard is displayed");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickOnRegisteraffiliateAccount();
		logger.info("User clicked on Register affliiate Account");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dt) {
		
		List<Map<String, String>> info = dt.asMaps(String.class, String.class);
		
		retail.enterCompanyName(info.get(0).get("company"));
		retail.enterWebsiteName(info.get(0).get("website"));
		retail.enterTaxId(info.get(0).get("taxID"));
		retail.selectPaymentMethod(info.get(0).get("paymentMethod"));
			
		logger.info("User entered affiliate form information " + info.toString());
	}

	@And("User check on About us checkbox")
	public void user_check_on_about_us_check_box() {
		retail.clickOnAboutUs();
		logger.info("User clicked on about us link");
	}

	@And("User click on Continue button")
	public void User_click_on_Continue_button() {
		retail.clickOnContinueButton();
		logger.info("user clicked on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retail.accountSuccessMessage());
		logger.info("Success message displayed");
	}

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retail.clickOnEditAffiliateInformation();
		logger.info("User clicked on affiliate Information");
	}

	@And("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnBankTransfer();
		logger.info("User clicked on Bank transfer button");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable data) {

		List<Map<String, String>> strInfo = data.asMaps(String.class, String.class);
		
		retail.enterBankName(strInfo.get(0).get("bankName"));
		retail.enterBranchName(strInfo.get(0).get("abaNumber"));
		retail.enterSwiftCode(strInfo.get(0).get("swiftCode"));
		retail.enterAccountName(strInfo.get(0).get("accountName"));
		retail.enterAccountNumber(strInfo.get(0).get("accountNumber"));

		logger.info("User entered bank information " + strInfo.toString());
	}
	
	@And("User clicks on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinue();
		logger.info("User clicked on Continue button");
	}
	
	@Then("User should see success message")
	public void User_should_see_success_message() {
		Assert.assertTrue(retail.succeessMsgDisplayed());
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickOnEditYourAccountInformationLink();
		logger.info("user clicked on edit yoru information account");
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable tbl) {
	
		List<Map<String, String>> accInfo = tbl.asMaps(String.class, String.class);
		retail.enterFirstName(accInfo.get(0).get("firstname"));
		retail.enterLastName(accInfo.get(0).get("lastName"));
		retail.enterEmail(accInfo.get(0).get("email"));
		retail.enterTelephoneNumber(accInfo.get(0).get("telephone"));

		logger.info("User entered informations as " + accInfo.toString());
	}

	@And("User should click on continue button")
	public void user_should_click_on_continue_button() {
		retail.continueClick();
		logger.info("User clicked on continue button");
	}


	@Then("^User should see a message '(.+)'$")
	public void user_should_see_a_message(String xpctd) {
		String actual = retail.succssMsg();
		String expected = xpctd;
		
		Assert.assertEquals(actual, expected);
		logger.info("Success message displayed");
	}

}
