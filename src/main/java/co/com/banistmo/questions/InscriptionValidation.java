package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.banistmo.userinterfaces.HelpPage.VALIDATE_INSCRIP;


public class InscriptionValidation implements Question<Boolean> {

    public static InscriptionValidation isVisible(){

        return new InscriptionValidation();

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(VALIDATE_INSCRIP).viewedBy(actor).asBoolean();
    }


}
