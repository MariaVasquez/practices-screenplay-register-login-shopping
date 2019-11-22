package us.com.yourlogo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static us.com.yourlogo.userinterfaces.MainPageRegisterAccount.SELECT_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_TITLE)
        );
    }

    public static CreateUser createUser() {
        return instrumented(CreateUser.class);
    }
}
