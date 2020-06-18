Feature: Login to the Free CRM application

Scenario: Sucessfully Login to the Free CRM Application

Given User Should be on the Login Screen
When User enter the Username and Password and Clicks on the Login Button
Then User Should Sucessfully Navigated to the Free CRM Home Screen
And User Should validate the HomeScreen Title and the Login User
And close the Browser