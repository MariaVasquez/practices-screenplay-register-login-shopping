package us.com.yourlogo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class MainPageYourLogo extends PageObject {

    public static final Target BUTTON_SIGNIN = Target.the("Button that reroute for authenticate or create an account")
            .locatedBy("//div[@class='header_user_info']/a");

}
