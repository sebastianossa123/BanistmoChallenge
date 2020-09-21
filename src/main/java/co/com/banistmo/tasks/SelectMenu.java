package co.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectMenu implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(
                   Click.on(MYTRIPS_BUTTON),
                   Click.on(YOUFIND_BUTTON)
           );

    }

    public static SelectMenu searchPage(){return instrumented(SelectMenu.class);}
}
