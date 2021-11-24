Feature: Retail page. For this feature you have to have an existing account

Background:
		Given User is on Retail website
		And User click  on MyAccount
		When User click on Login
		And User enter username 'sar@gmail.com' and password '123456'
		And User click on Login button
		Then User should be logged in to MyAccount dashboard


Scenario: Register as an Affiliate user with Cheque Payment Method
		When User click on Register for an Affiliate Account link
		And User fill affiliate form with below information
		|company|website|taxID|paymentMethod|
		|Tekschool|www.tekschool.us|2345|Paypal|
		And User check on About us checkbox
		And User click on Continue button
		Then User should see a success message

@smokeTest
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		When User click on Edit your affiliate information link
		And User click on Bank Transfer radio button
		And User fill Bank information with below information
	  |bankName|abaNumber|swiftCode|accountName|accountNumber|
	  |TD Bank|348734|T323|Ali Mohammadi|54657676|
		And User clicks on Continue button
		Then User should see success message

@smokeTest
Scenario: Edit your account Information
		When User click on Edit your account information link
		And User modify below information
		|firstname|lastName|email|telephone|
		|Ali|Ali|sar@gmail.com|4356668878|
		And User should click on continue button
		Then User should see a message 'Success: Your account has been successfully updated'
