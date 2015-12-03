Feature: Login and logout functionality of OrangeHRM

Scenario: Login Test
	Given the browser is launched and navigated to url
	When the tester enters valid username and passowrd
	And clicks on the login button
	Then welcome admin msg is diplayed
	
Scenario: Logout Test
	When user clicks on welcome admin link
	And also clicks on Logout link
	Then should logout of the app and display the home page