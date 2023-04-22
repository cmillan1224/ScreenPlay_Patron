package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.NavigateTo;
import co.com.proyectobase.screenplay.tasks.SearchWord;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;

public class GoogleStepDefinitions {

    @Given("el {string} esta en la pagina de google")
    public void elUsuarioEstaEnLaPaginaDeGoogle(String actorNamed){
        actor.assignName(actorNamed);
        actor.attemptsTo(
                NavigateTo.theGooglePage()
        );
    }

    @When("el usuario busca la palabra {word}")
    public void elUsuarioBuscaLaPalabraColombia(String palabra) {
        actor.attemptsTo(
                SearchWord.the(palabra)
        );
    }

    @Then("el usuario deberia ver la palabra {word}")
    public void elUsuarioDeberiaVerLaPalabraColombia(String resultado) {

    }

}
