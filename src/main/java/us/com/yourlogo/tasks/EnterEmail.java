package us.com.yourlogo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.Util;

import static us.com.yourlogo.userinterfaces.MainPageAutentication.BUTTON_CREATEACCOUNT;
import static us.com.yourlogo.userinterfaces.MainPageAutentication.INPUT_EMAIL_CREATE;

public class EnterEmail implements Task {
    Util data = new Util();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(data.getExcelFile(1,0)).into(INPUT_EMAIL_CREATE),
                    Click.on(BUTTON_CREATEACCOUNT)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static EnterEmail enterEmail() {
        return Tasks.instrumented(EnterEmail.class);
    }
}
