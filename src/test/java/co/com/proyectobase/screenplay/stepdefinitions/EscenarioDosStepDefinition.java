package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarMultiplesProductos;
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

public class EscenarioDosStepDefinition {

    @Given("el {word} se encuentra en la pagina myStore")
    public void elUsuarioSeEncuentraEnLaPaginaMyStore(String actorNamed) {
        // Write code here that turns the phrase above into concrete actions
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_SIGN_IN));
           }
    @When("busca el tipo de producto que quiere {string}")
    public void buscaElTipoDeProductoQueQuiere(String nombreProducto) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(BuscarProducto.llamado(nombreProducto));
         }
    @And("agrega los productos que desea al carrito de compras")
    public void agregaLosProductosQueDeseaAlCarritoDeCompras() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(AgregarMultiplesProductos.alCarrito());
      }

    @Then("deberia ver un mensaje de confirmacion y la cantidad de productos en el carrito")
    public void deberiaVerUnMensajeDeConfirmacionYLaCantidadDeProductosEnElCarrito() {
        actor.should(
                eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO),
                        containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds(),
                eventually(seeThat(the(VentanaEmergente.TITULO_CANTIDAD_DE_PRODUCTOS),
                        containsText("There are 2 items in your cart."))).waitingForNoLongerThan(30).seconds()
        );
    }
}
