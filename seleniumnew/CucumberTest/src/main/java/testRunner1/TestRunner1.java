package testRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/feature/facebook1.feature"},
                 glue={"src/main/java/stepdef/facebooklogin.java"},
                    format={"pretty","html:test-output"},
                     monochrome= true,
                     dryRun = true)
                    
                  
public class TestRunner1 {
}
