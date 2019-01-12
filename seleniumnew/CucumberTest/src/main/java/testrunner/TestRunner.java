package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/feature/Demo.feature"}, // the path of feature file
                  glue={"src/main/java/stepdef/Demo.java"}, // the path of step def file
				 dryRun=true,// to check mapping proper between feature file and step definition file
				 strict=true,//it will check if any step definition is not defined
				 monochrome=true)// display the console output in a proper readable format
public class TestRunner {

}
