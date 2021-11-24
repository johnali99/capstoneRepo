package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyClick;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement SelectEuro;

	@FindBy(xpath = "//strong[text()='€']")
	private WebElement EuroSignVerify;

	/**
	 * User empty Shopping cart message displays
	 */

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement clickShoptingCart;

	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement emptyShopingCart;

	/**
	 * Methods
	 */
	
	public void clickOnCurrency() {
		currencyClick.click();
	}

	public void clickOnEURCurrency() {
		SelectEuro.click();
	}

	public boolean eurDisplay() {
		if (EuroSignVerify.isDisplayed())
			return true;
		else
			return false;
	}

	// Scenario: User empty Shopping cart message displays

	public void clickShopingCart() {
		clickShoptingCart.click();
	}

	public String shopingCartMessage() {
		return emptyShopingCart.getText();
	}

}
