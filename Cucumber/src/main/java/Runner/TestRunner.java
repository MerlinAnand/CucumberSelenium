package Runner;		

import org.junit.Test;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue="stepDefinition",plugin={"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml","html:target/Cucumber-reports"})						
public class TestRunner 				
{		

}