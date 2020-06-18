package config.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen 
{
	
		WebDriver driver;
		By loginUserName = By.xpath("//span[@class='user-display']");

public HomeScreen(WebDriver driver)
{
	this.driver= driver;
}
		
		
public WebElement loginUserName()
{
	return driver.findElement(loginUserName);
			
}
		
		
		
}


