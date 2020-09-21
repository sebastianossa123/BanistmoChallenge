package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.InscriptionValidation;
import co.com.banistmo.questions.TextValidation;
import co.com.banistmo.tasks.HelpMenu;
import co.com.banistmo.tasks.SelectMenu;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.banistmo.util.WebDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Banistmo2StepDefinition {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }


    @Given("^the user need to enter the latam$")
    public void the_user_need_to_enter_the_latam() throws Throwable {
        theActorCalled("sebas");
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome()));
    }

    @When("^the user search the help center$")
    public void the_user_search_the_help_center() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                HelpMenu.centerHelp()
        );
    }

    @Then("^the user should see the validation$")
    public void the_user_should_see_the_validation() throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(InscriptionValidation.isVisible()));
    }
}
