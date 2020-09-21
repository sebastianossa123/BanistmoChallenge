package co.com.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HelpPage extends PageObject {
    public static final Target HELP_BUTTON = Target.the("button the my trips").locatedBy("/html/body/header/div/div[2]/div/div/div/div[3]/ul/li[1]/div/a");
    public static final Target VALIDATE_INSCRIP = Target.the("Inscripcion validate").locatedBy("//*[@id=\"start-of-content\"]/div/div[1]/h1");
}
