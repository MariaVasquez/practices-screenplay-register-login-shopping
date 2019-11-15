package us.com.yourlogo.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import us.com.yourlogo.tasks.OpenWebsite;
import us.com.yourlogo.tasks.PageSignIn;
import us.com.yourlogo.userinterfaces.MainPageYourLogo;

import java.util.List;

public class CreateUserStepDefinition {

    private Actor maria = Actor.named("Maria");
    private MainPageYourLogo mainPageYourLogo;
    @Managed(driver = "chrome")
    private WebDriver webDriver;


    @Given("^enter the website YourLogo$")
    public void enterTheWebsiteYourLogo() {
        maria.can(BrowseTheWeb.with(webDriver));
        maria.attemptsTo(OpenWebsite.page(mainPageYourLogo));
    }

    @When("^click the Sign In button to redirect to the authentication page$")
    public void clickTheSignInButtonToRedirectToTheAuthenticationPage()  {
        maria.attemptsTo(PageSignIn.pageSignIn());
    }

    @When("^in the modal of creating an account, enter the email and click the Create Account button$")
    public void inTheModalOfCreatingAnAccountEnterTheEmailAndClickTheCreateAccountButton(DataTable data)  {
        List<String> list = data.asList(String.class);
        System.out.println(list);
        maria.attemptsTo();
    }

}
