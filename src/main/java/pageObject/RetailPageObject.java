package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //span[text()='My Account']")
	private WebElement homePageMyAccount;

	@FindBy(xpath = "//a[text()='Login'] ")
	private WebElement myAccountLogin;

	@FindBy(xpath = "//input[@id='input-email'] ")
	private WebElement myAccountUserName;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement myAccountPassword;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement myAccountClickLoginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	// Scenario: Register as an Affiliate user with Cheque Payment Method

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement RegisteraffiliateAccount;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement cheque;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypal;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUs;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueBtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliateAccountSuccessMessage;

	// Scenario: Edit your affiliate information from Cheque payment method to Bank
	// Transfer

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiliateInformation;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement selectBankTransferRadioBtn;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement editBankName;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement editBranchNumber;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement editSwiftCode;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement editAccountName;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement editAccountNumber;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editContinueBtn;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement EditAffiliateInformationSucceMessage;
	
	//Edit your account Information

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement clickAccInfoLink;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement enterFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement enterLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickContinue;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement displayedSuccessMsg;

	// Background

	public void clickOnMyAccount() {
		homePageMyAccount.click();
	}

	public void clickOnLogin() {
		myAccountLogin.click();
	}

	public void enterUserNameAndPassword(String uName, String pwd) {
		myAccountUserName.sendKeys(uName);
		myAccountPassword.sendKeys(pwd);
	}

	public void clickOnLoginButton() {
		myAccountClickLoginButton.click();
	}

	public boolean myAccountDashboard() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	// Scenario: Register as an Affiliate user with Cheque Payment Method

	public void clickOnRegisteraffiliateAccount() {
		RegisteraffiliateAccount.click();
	}

	public void enterCompanyName(String companyName) {
		company.sendKeys(companyName);
	}

	public void enterWebsiteName(String webName) {
		website.sendKeys(webName);
	}

	public void enterTaxId(String tax) {
		taxId.sendKeys(tax);
	}

	public void selectPaymentMethod(String value) {
		if (value.equalsIgnoreCase("Cheque") && !cheque.isSelected())
			cheque.click();
		else if (value.equalsIgnoreCase("PayPal") && !paypal.isSelected())
			paypal.click();
		else if (value.equalsIgnoreCase("Bank Transfer") && !bankTransfer.isSelected())
			bankTransfer.click();
	}

	public void clickOnAboutUs() {
		aboutUs.click();
	}

	public void clickOnContinueButton() {
		continueBtn.click();
	}

	public boolean accountSuccessMessage() {
		if (affiliateAccountSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	// Scenario: Edit your affiliate information from Cheque payment method to Bank
	// Transfer

	public void clickOnEditAffiliateInformation() {
		EditAffiliateInformation.click();
	}

	public void clickOnBankTransfer() {
		selectBankTransferRadioBtn.click();
	}

	public void enterBankName(String bankName) {
		editBankName.sendKeys(bankName);
	}

	public void enterBranchName(String branchName) {
		editBranchNumber.sendKeys(branchName);
	}

	public void enterSwiftCode(String swiftCode) {
		editSwiftCode.click();
	}

	public void enterAccountName(String accountName) {
		editAccountName.sendKeys(accountName);
	}

	public void enterAccountNumber(String accountNumber) {
		editAccountNumber.click();
	}

	public void clickOnContinue() {
		editContinueBtn.click();
	}

	public boolean succeessMsgDisplayed() {
		if (EditAffiliateInformationSucceMessage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnEditYourAccountInformationLink() {
		clickAccInfoLink.click();
	}

	public void enterFirstName(String firstName) {
		enterFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		enterLastName.sendKeys(lastName);
	}

	public void enterEmail(String emailAdd) {
		email.sendKeys(emailAdd);
	}

	public void enterTelephoneNumber(String phone) {
		telephone.sendKeys(phone);
	}

	public void continueClick() {
		clickContinue.click();
	}

	public String succssMsg() {
		return displayedSuccessMsg.getText();
	}

}
