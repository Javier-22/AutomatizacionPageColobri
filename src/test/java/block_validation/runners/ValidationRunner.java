package block_validation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Validation.feature",
tags ="@story",
glue ="block_validation.stepdefinitions",
snippets = SnippetType.CAMELCASE)

public class ValidationRunner {

}







