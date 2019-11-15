package us.com.yourlogo.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\register_user.feature",
        glue = "us.com.yourlogo.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateUserRunner {
}
