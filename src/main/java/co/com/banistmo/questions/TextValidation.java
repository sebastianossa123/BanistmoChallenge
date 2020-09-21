package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.w3c.dom.Text;


import static co.com.banistmo.userinterfaces.MenuPage.VBCDGG_TEXT;

public class TextValidation implements Question<Boolean> {


    public static TextValidation isVisible(){

        return new TextValidation();

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(VBCDGG_TEXT).viewedBy(actor).asBoolean();


    }
}
