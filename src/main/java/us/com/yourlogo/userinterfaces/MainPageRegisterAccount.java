package us.com.yourlogo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageRegisterAccount extends PageObject {
    public static final Target SELECT_TITLE = Target.the("").locatedBy("//label[text()='Mr.']/div/span/input");
    public static final Target BUTTON_CREATEACCOUNT = Target.the("").located(By.id(""));
}
