package co.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.userinterfaces.HelpPage.HELP_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HelpMenu implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HELP_BUTTON)
        );

    }

    public static HelpMenu centerHelp(){return instrumented(HelpMenu.class);}
}
