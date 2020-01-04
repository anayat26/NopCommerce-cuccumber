Feature: Login 

Background: Common steps
           Given user launch chrome browser 
	       When user opens url "http://admin-demo.nopcommerce.com/login" 

@valid
Scenario: Successful login with valid credentials
	And user enter email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	When user click on log out link 
	And close browser 
	
@invalid	
Scenario Outline: Login Data Driven 
	And user enter email as "<Email>" and password as "<Password>" 
	And click on login 
	And close browser 
	
	Examples: 
		|Email               | Password|
		|amdin1@yourstore.com | admin1   |
		|amdn@yourstore.come | amd     |
			
	