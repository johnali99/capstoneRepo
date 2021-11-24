package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;

public class DesktopPageObject extends Base{

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * User verify all items are present in Desktops tab
	 */
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement DesktopsTextVerification;
	
	@FindBy(xpath = "//img[@class='img-thumbnail']")
	private WebElement desktopIMGConfirm;
	
	@FindBy(xpath = "//div[@class='col-sm-10']")
	private WebElement exampleOfCatactoryText;
	
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement ListButtonDisplay;
	
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement GirdButtonDisplay;
	
	
	
	
//	@FindBy(xpath = "//a[text()='Product Compare (0)']")
//	private WebElement productCompareDisplay;
//	
//	@FindBy(xpath = "//label[text()='Sort By:']")
//	private WebElement sortByDropdownDisplay;
//	
//	@FindBy(xpath = "//label[text()='Show:']")
//	private WebElement showDropDownDisplay;
//	
//	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
//	private WebElement AppleCinemaDisplayText;
//	
//	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
//	private WebElement CanonEOSDisplay;
//	
//	@FindBy(xpath = "//a[text()='HP LP3065']")
//	private WebElement HPLP3065Display;
//	
//	@FindBy(xpath = "//a[text()='HTC Touch HD']")
//	private WebElement HTCTouchTxtDisplay;
//	
//	@FindBy(xpath = "//a[text()='iPhone']")
//	private WebElement iPhoneTextDisplay;
//	
//	@FindBy(xpath = "//a[text()='iPod Classic']")
//	private WebElement ipodClassicDiplayText;
//	
//	@FindBy(xpath = "//a[text()='MacBook']")
//	private WebElement MacBookTxtDisplay;
//	
//	@FindBy(xpath = "//a[text()='MacBook Air']")
//	private WebElement MacBookAirDisplayTxt;
//	
//	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
//	private WebElement palmTreoProTxtDisplay;
//	
//	@FindBy(xpath = "//a[text()='Product 8']")
//	private WebElement product8Displaytxt;
//	
//	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
//	private WebElement SamsungSynDisplayTxt;
//	
//	@FindBy(xpath = "//a[text()='Sony VAIO']")
//	private WebElement SonyVAIOTxtDisplay;
//	
//	@FindBy(xpath = "//a[text()='Desktops (13)']")
//	private WebElement DesktopsMenuBarPresent;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[1]")
//	private WebElement PCMenuPresent;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[2]")
//	private WebElement MacMenuPresent;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[3]")
//	private WebElement laptopsAndNoteBooksMenuDisplay;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[4]")
//	private WebElement componentsMenuDisplay;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[5]")
//	private WebElement tabletsMenuDisplay;
//
//	@FindBy(xpath = "(//a[@class='list-group-item'])[6]")
//	private WebElement SoftwareMenueDisplay;
//
//	@FindBy(xpath = "(//a[@class='list-group-item'])[7]")
//	private WebElement phonesAndPADsDisplay;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[8]")
//	private WebElement camerasDisplay;
//	
//	@FindBy(xpath = "(//a[@class='list-group-item'])[9]")
//	private WebElement MP3PlayersDisplay;
//	
//	@FindBy(xpath = "//img[@alt='HP Banner']")
//	private WebElement HPBannerIMGDisplay;
//	
//	@FindBy(xpath = "//h5[text()='Information']")
//	private WebElement pageFooterInformationText;
//	
//	@FindBy(xpath = "//h5[text()='Customer Service']")
//	private WebElement pageFooterCustomerServiceTxt;
//	
//	@FindBy(xpath = "//h5[text()='Extras']")
//	private WebElement pageFooterExtraTxt;
//	
//	@FindBy(xpath = "//h5[text()='My Account']")
//	private WebElement pageFooterMyAccount;
	
	
	/**
	 * User add HP LP 3065  from Desktops tab to the cart
	 * @return
	 */
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement HPLP3065AddToCart;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement numberofHPLaptops;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
//	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
//	private WebElement successMsg;
	
	/**
	 * User add Canon EOS 5D from Desktops tab to the cart
	 * @return
	 */
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement AddToCartCanon;
	
	@FindBy(xpath = "//select[@name='option[226]']")
	private WebElement ClickSelectOption;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement selectRedColor;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QuantityOne;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement AddToCartBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement CanonSuccessMsgDisplay;
	
	/**
	 * User add a review to Canon EOS 5D item in Desktops tab
	 */
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonClick;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewClick;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement nameEnter;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReview;
	
	@FindBy(xpath= "(//input[@type='radio'])[1]")
	private WebElement badRating;
	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[1]/input[2]")
//	private WebElement ratingTwo;
//	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[1]/input[3]")
//	private WebElement ratingThree;
//	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[1]/input[4]")
//	private WebElement ratingFour;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement goodRating;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement clickContinueButton;
	
	@FindBy(xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement reviewSuccessMsg;
	
	
	//*****************************************************************************************************
	
	
	public void desktopClick() {
		desktops.click();
	}
	
	public void showAllDesktopClick() {
		showAllDesktops.click();
	}
	
	public boolean DesktopsTextPresent() {
		if(DesktopsTextVerification.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean isDektopImgPresent() {
		if(desktopIMGConfirm.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean exampleTxtVerification() {
		if(exampleOfCatactoryText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean refinesearchTxt() {
		if(refineSearchText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean listButtonDisplayed() {
		if(ListButtonDisplay.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean gridButtonDisplayed() {
		if(GirdButtonDisplay.isDisplayed())
			return true;
		else
			return false;
	}

	/**
	 * User add HP LP 3065  from Desktops tab to the cart
	 * @return
	 */
	
	public void HPLPAddToCart() {
		HPLP3065AddToCart.click();
	}
	
	public void enterQuantity(String value) {
		numberofHPLaptops.sendKeys(value);
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
	
//	public String successMsg() {
//		return successMsg.getText();
//	}
	
	/**
	 * User add Canon EOS 5D from Desktops tab to the cart
	 * @return
	 */
	
	
	public void clickCanonAddToCart() {
		AddToCartCanon.click();
	}
	
	public void selectDropdown() {
		ClickSelectOption.click();
	}
	
	public void selectRedColor() {
		selectRedColor.click();
	}
	
	public void quantityAdd(String str) {
		QuantityOne.sendKeys(str);
	}
	
	public void clickAddToCartButton() {
		AddToCartBtn.click();
	}
	
	public boolean isSuccessMsgDisplayed() {
		if(CanonSuccessMsgDisplay.isDisplayed())
			return true;
		else
			return false;
	}
	
	/**
	 * User add a review to Canon EOS 5D item in Desktops tab
	 */
	
	
	public void clickOnCanon() {
		canonClick.click();
	}
	
	public void writeReviewClick() {
		writeReviewClick.click();
	}
	
	public void enterName(String name) {
		nameEnter.sendKeys(name);
	}
	
	public void writeYourReview(String reviews) {
		yourReview.sendKeys(reviews);
	}
	
	public void reviewRating(String str) {
		if(str.equalsIgnoreCase("good") && !badRating.isSelected())
			badRating.click();
		else if(str.equalsIgnoreCase("bad") && !goodRating.isSelected())
			goodRating.click();
	}
	
	public void clickContinue() {
		clickContinueButton.click();
	}
	
	//////////////////////////////
	public String reviewSuccess() {
		return reviewSuccessMsg.getText();
	}
	
	public  WebElement successMessageElement() {
		return reviewSuccessMsg;
	}
	
}
