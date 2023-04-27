package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarCantidadProductos;
import co.com.proyectobase.screenplay.tasks.Aumentar;
import co.com.proyectobase.screenplay.tasks.Navegar;
import co.com.proyectobase.screenplay.ui.VentanaEmergente;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.Wait;
import org.hamcrest.Matcher;

import java.util.concurrent.Callable;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static co.com.proyectobase.screenplay.ui.VentanaEmergente.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenarioTresStepDefinition {
    @Given("que el {word} esta en la pagina myStore")
    public void queElUsuarioEstaEnLaPaginaMyStore(String actorNamed) {
        // Write code here that turns the phrase above into concrete actions
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_PRODUCTO));
    }
    @When("agrega el producto al carrito seleccionando la {int}")
    public void agregaElProductoAlCarritoSeleccionandoLaCantidad(Integer cantidad) {
        actor.attemptsTo(
                Aumentar.laCantidad((cantidad)),
                AgregarCantidadProductos.alCarrito()
                );
    }
    @Then("deberia ver un mensaje de confirmacion y la {int} del producto en el carrito")
    public void deberiaVerUnMensajeDeConfirmacionYLaCantidadDelProductoEnElCarrito(Integer cantidad) {
        actor.should(
                eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO_DOS),containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds(),
                eventually(seeThat(the(CARRITO_CANTIDAD_DE_PRODUCTOS),containsText("There are "+ cantidad +" items in your cart."))).waitingForNoLongerThan(30).seconds()


        );
    }
}
