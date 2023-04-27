package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarProducto;
import co.com.proyectobase.screenplay.tasks.BuscarProducto;
import co.com.proyectobase.screenplay.tasks.Navegar;
import co.com.proyectobase.screenplay.ui.VentanaEmergente;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenarioUnoStepDefinition {



    @Given("el {word} esta en la pagina myStore")
    public void elUsuarioEstaEnLaPaginaMyStore(String actorNamed) {
        // Write code here that turns the phrase above into concrete actions
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_SIGN_IN));

    }
    @When("cuando busca el producto {string}")
    public void cuandoBuscaElProducto(String nombreProducto) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(BuscarProducto.llamado(nombreProducto));
    }

    @And("agrega el producto que desea al carrito")
    public void agregaElProductoQueDeseaAlCarrito() {
        actor.attemptsTo(AgregarProducto.alCarrito());
    }

    @Then("deberia ver un mensaje de confirmacion que indica que el producto se agrego correctamente al carrito")
    public void deberiaVerUnMensajeDeConfirmacionQueIndicaQueElProductoSeAgregoCorrectamenteAlCarrito() {
        //actor.should(seeThat(ventanaEmergente.contengaSubtitulo(),equals("")));
        actor.should(
                eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO),
                        containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds());
    }
}
