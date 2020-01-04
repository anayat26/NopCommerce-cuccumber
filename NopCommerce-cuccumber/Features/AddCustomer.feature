Feature: Customer 

@AddNewCustomer
Scenario: Add New Customer 
    Given user launch chrome browser 
	When user opens url "http://admin-demo.nopcommerce.com/login" 
	And user enter email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	When click on customer menu 
	Then click on customer
	Then click on add new 
	When enter customer information 
	Then click save button 
	And close browser 