package us.com.yourlogo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static us.com.yourlogo.userinterfaces.MainPageYourLogo.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageSignIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGNIN)
        );
    }
    public static PageSignIn pageSignIn () {
        return instrumented(PageSignIn.class);
    }
}
