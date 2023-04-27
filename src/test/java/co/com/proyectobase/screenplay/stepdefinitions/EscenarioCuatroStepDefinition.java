package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarProductoConTalla;
import co.com.proyectobase.screenplay.tasks.Navegar;
import co.com.proyectobase.screenplay.ui.VentanaEmergente;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenarioCuatroStepDefinition {

    @Given("el {word} esta en la pagina my Store")
    public void elUsuarioEstaEnLaPaginaMyStore(String actorNamed) {
        // Write code here that turns the phrase above into concrete actions
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_PRODUCTO));
    }
    @When("agrega el producto al carrito seleccionando la talla deseada")
    public void agregaElProductoAlCarritoSeleccionandoLaTallaDeseada() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(AgregarProductoConTalla.enElCarrito());
    }
    @Then("deberia ver un mensaje de confirmacion que indica que el producto se agrego correctamente")
    public void deberiaVerUnMensajeDeConfirmacionQueIndicaQueElProductoSeAgregoCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(
                eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO_DOS),containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds(),
                eventually(seeThat(the(VentanaEmergente.RESULTADO_DE_TALLA_Y_COLOR), containsText("M"))).waitingForNoLongerThan(30).seconds()
                );
    }

}
