package config.qa.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.qa.tests.LoginTest;
import config.qa.tests.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination  extends TestBase
{
	
	LoginTest logTest;	
	WebDriverWait wait;
	@Given("^User Should be on the Login Screen$")
	public void user_Should_be_on_the_Login_Screen() throws Throwable {
		TestBase.preCondition();
	    
	}

	@When("^User enter the Username and Password and Clicks on the Login Button$")
	public void user_enter_the_Username_and_Password_and_Clicks_on_the_Login_Button() throws Throwable {
		logTest = new LoginTest();
		logTest.validationofSucessfullLogin();
	
	    
	}

	@Then("^User Should Sucessfully Navigated to the Free CRM Home Screen$")
	public void user_Should_Sucessfully_Navigated_to_the_Free_CRM_Home_Screen() throws Throwable {
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Home']"))));
		System.out.println("User Sucessfully navigated to the Home Screen");
	}

	@Then("^User Should validate the HomeScreen Title and the Login User$")
	public void user_Should_validate_the_HomeScreen_Title_and_the_Login_User() throws Throwable {
		
		logTest.ValidateTheHomeScreenTitle();
		logTest.validateTheLoginUser();
	    
	}
	
	@And("^close the Browser$")
	public void close_the_browser()
	{
		driver.quit();
	}


}
