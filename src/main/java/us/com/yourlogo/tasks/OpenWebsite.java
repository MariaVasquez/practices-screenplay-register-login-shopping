package us.com.yourlogo.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import us.com.yourlogo.userinterfaces.MainPageYourLogo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWebsite implements Task {
    private PageObject pageObject;

    public OpenWebsite(PageObject pageObject) {
        this.pageObject = pageObject;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(pageObject)
        );
    }

    public static OpenWebsite page (MainPageYourLogo pageObject) {
        return instrumented(OpenWebsite.class, pageObject);
    }
}
