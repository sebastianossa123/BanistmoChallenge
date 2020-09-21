package co.com.banistmo.stepdefinitions;

import co.com.banistmo.tasks.SelectMenu;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.runner.RunWith;

import static co.com.banistmo.util.WebDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BanistmoStepDefinition {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("^the user need to enter the latam page$")
    public void the_user_need_to_enter_the_latam_page() throws Throwable {
        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome()));
    }

    @When("^the user search the infomation$")
    public void the_user_search_the_infomation() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                SelectMenu.searchPage()
        );

    }

    @Then("^the user should see the validation length$")
    public void the_user_should_see_the_validation_length() throws Throwable {

    }
}
