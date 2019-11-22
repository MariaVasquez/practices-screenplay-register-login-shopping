package us.com.yourlogo.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import us.com.yourlogo.tasks.CreateUser;
import us.com.yourlogo.tasks.EnterEmail;
import us.com.yourlogo.tasks.OpenWebsite;
import us.com.yourlogo.tasks.PageSignIn;
import us.com.yourlogo.userinterfaces.MainPageYourLogo;

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
    public void clickTheSignInButtonToRedirectToTheAuthenticationPage() {
        maria.attemptsTo(PageSignIn.pageSignIn());
    }

    @When("^in the modal of creating an account, enter the email and click the Create Account button$")
    public void inTheModalOfCreatingAnAccountEnterTheEmailAndClickTheCreateAccountButton() {
        maria.attemptsTo(EnterEmail.enterEmail());
    }

    @When("^when you reach the Create Account form, the user fills in the fields with the information and click in Register$")
    public void whenYouReachTheCreateAccountFormTheUserFillsInTheFieldsWithTheInformationAndClickInRegister() {
        maria.attemptsTo(CreateUser.createUser());
    }

    /*@Then("^validate that your account was registered with the message$")
    public void validateThatYourAccountWasRegisteredWithTheMessage(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }*/

}
