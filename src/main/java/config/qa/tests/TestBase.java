package config.qa.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase 
{
		 public static  WebDriver driver;
		 public static Properties prop;
		 
		 public TestBase()
		 {
			 try {
				 prop = new Properties();
				 FileInputStream fis= new FileInputStream("D:\\CucumberWorkSpace\\FreeCRMPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
				 prop.load(fis);
			 	}
			 catch (IOException e) {
				// TODO: handle exception
			}	 
		 }
		 
		 public static void preCondition()
		 {
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("InternetExplorer"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\chromedriver.exe");
				driver = new InternetExplorerDriver();
			}
			
			else {
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			
			driver.get(prop.getProperty("url"));
		 }
		 
		 
		
}
