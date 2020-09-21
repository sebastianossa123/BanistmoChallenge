package co.com.banistmo.stepdefinitions;

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

    @Given("^dado que haga algo$")
    public void dado_que_haga_algo() throws Throwable {
       theActorCalled("user");
       theActorInTheSpotlight().can(BrowseTheWeb.with((chrome())));
    }

    @When("^interacciones$")
    public void interacciones() throws Throwable {

    }

    @Then("^afirmacion validaciones$")
    public void afirmacion_validaciones() throws Throwable {


    }
}
