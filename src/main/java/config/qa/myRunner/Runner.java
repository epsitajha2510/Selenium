package config.qa.myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"D:\\CucumberWorkSpace\\FreeCRMPOM\\src\\main\\java\\config\\qa\\features\\login.feature"}
				,glue= {"config\\qa\\stepDefination"}
				,plugin= {"pretty", "html:test-output"}
				,format= {"json:json_output/Cucumber.json","junit:junit_output/cucumber.xml"}
				,dryRun =false
				,monochrome= true
				,strict= true
				//tags = {"@SmokeTest" , "~@RegressionTest", "~@End2End"}
				)

public class Runner 
{

}
