Feature: Search Customer 

Background: Common Steps 
	Given user launch chrome browser 
	When user opens url "http://admin-demo.nopcommerce.com/login" 
	And user enter email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	When click on customer menu 
	Then click on customer 
@SearchCustByEmailID 
Scenario: Search customer by emailID 
	Then enter Email ID 
	Then click on search Btn 
	And close browser 
@SearchCustByName 
Scenario: Search customer by Name 
	Then enter fisrt name 
	Then enter last name 
	Then click on search Btn 
	And close browser