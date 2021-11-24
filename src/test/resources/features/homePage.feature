Feature: Home Page

Background: 
	Given user is on Retail website

Scenario: User verify currency values change
		When user click on Currency
		And user Choose Euro from dropdown
		Then currency value should change to Euro

@regression
Scenario: User empty Shopping cart message displays

		When user click on shopping cart
	  Then 'your shopping cart is empty!' message should display
