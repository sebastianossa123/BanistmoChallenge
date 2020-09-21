package co.com.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {

    public static final Target MYTRIPS_BUTTON = Target.the("button the my trips").locatedBy("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/nav/div[4]/a/div/div[2]/p");
    public static final Target YOUFIND_BUTTON = Target.the("where do you find it button").locatedBy("//*[@id=\"bookingSearchForm-c81__open-modal\"]/span[1]");
    public static final Target VBCDGG_TEXT = Target.the("text in the page").locatedBy("//*[@id=\"modalRecordLocator\"]/div/div/div[1]/p[1]/span[1]");





}
