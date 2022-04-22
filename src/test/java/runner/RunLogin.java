package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"}, //src/test/java/features/Login.feature", "scr/test/java/features/CreateLead.features 
				 glue = "steps",
				 monochrome = true, 
				 tags = {"@functional", "@regression"},
				 //tags = {"@functional","@smoke"}) - if any scenario is mentioned as both functional and smoke will execute
				 //tags = {"~@regression"} - exclude regression all other scenarios will execute
				 //tags = {"@regession"} - only regression will execute
				 //tags = {"@functional,@regression"} - either functional or regression
				 plugin = {"pretty","html:report"}
				//dryRun = true, 
				//snippets = SnippetType.CAMELCASE // to get the method name with camelCase use dryRun and snippets in the annotation
				)
public class RunLogin extends AbstractTestNGCucumberTests{	

}
