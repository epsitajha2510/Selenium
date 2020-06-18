$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/CucumberWorkSpace/FreeCRMPOM/src/main/java/config/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Free CRM application",
  "description": "",
  "id": "login-to-the-free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sucessfully Login to the Free CRM Application",
  "description": "",
  "id": "login-to-the-free-crm-application;sucessfully-login-to-the-free-crm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Should be on the Login Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the Username and Password and Clicks on the Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Should Sucessfully Navigated to the Free CRM Home Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Should validate the HomeScreen Title and the Login User",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.user_Should_be_on_the_Login_Screen()"
});
formatter.result({
  "duration": 9393306100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enter_the_Username_and_Password_and_Clicks_on_the_Login_Button()"
});
formatter.result({
  "duration": 914420200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_Should_Sucessfully_Navigated_to_the_Free_CRM_Home_Screen()"
});
formatter.result({
  "duration": 3574377200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_Should_validate_the_HomeScreen_Title_and_the_Login_User()"
});
formatter.result({
  "duration": 68433100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 897015600,
  "status": "passed"
});
});