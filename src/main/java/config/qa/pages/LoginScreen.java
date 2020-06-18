package config.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen 
{
	WebDriver driver;
	By username = By.xpath("//input[@name='email']");
	By password =By.xpath("//input[@name='password']");
	By SignInButton = By.xpath("//div[text()='Login']");
	
	
	public LoginScreen(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement SignInButton()
	{
		return driver.findElement(SignInButton);
	}
}
