package config.qa.tests;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.qa.pages.HomeScreen;
import config.qa.pages.LoginScreen;

public class LoginTest extends TestBase 
{
	
	//WebDriver driver;
	WebDriverWait wait;
	LoginScreen lScreen;
	HomeScreen hScreen;
	public void validationofSucessfullLogin()
	{
		lScreen = new LoginScreen(driver);
		lScreen.username().sendKeys(prop.getProperty("username"));
		lScreen.password().sendKeys(prop.getProperty("password"));
		lScreen.SignInButton().click();
	}
	
	
	public void ValidateTheHomeScreenTitle()
	{
		 String actualtitleofHomeScreen ="Cogmento CRM";
		 String expectedtitleofHomeScreen =driver.getTitle();
		 Assert.assertEquals(expectedtitleofHomeScreen,actualtitleofHomeScreen);
		 System.out.println("The title of the Home Screen is:" + driver.getTitle()); 
		 
	 }
	
	public void validateTheLoginUser()
	{
		hScreen = new HomeScreen(driver);
		String loggedInUserName =hScreen.loginUserName().getText();
		Assert.assertEquals(loggedInUserName, "Epsita Jha");
		System.out.println("The Logged In UserName is :"+ loggedInUserName);
	}
}
