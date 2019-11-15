package us.com.yourlogo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageAutentication extends PageObject {
    public static final Target INPUT_EMAIL_CREATE = Target.the("Input that pay in email").located(By.id("email_create"));
}
