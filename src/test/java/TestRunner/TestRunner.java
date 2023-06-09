package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/features",
		glue="stepDefinition",stepNotifications=true, tags="@SmokeTest",monochrome=true,
	    plugin= {"pretty","html:target/cucumber.html"} )
		

public class TestRunner {

}
