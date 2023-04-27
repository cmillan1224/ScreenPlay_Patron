package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarProductoConColor;
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

public class EscenarioCincoStepDefinition {
    @Given("{word} esta en la pagina my Store")
    public void usuarioEstaEnLaPaginaMyStore(String actorNamed) {
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_PRODUCTO));
    }
    @When("agrega el producto al carrito seleccionando el color deseado")
    public void agregaElProductoAlCarritoSeleccionandoElColorDeseado() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                AgregarProductoConColor.enElCarrito()
        );
    }
    @Then("deberia ver un mensaje de confirmacion indicando que el producto se agrego correctamente")
    public void deberiaVerUnMensajeDeConfirmacionIndicandoQueElProductoSeAgregoCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        actor.should(
                eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO_DOS),containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds(),
                eventually(seeThat(the(VentanaEmergente.RESULTADO_DE_TALLA_Y_COLOR), containsText("Blue"))).waitingForNoLongerThan(30).seconds()
                );
    }

}
