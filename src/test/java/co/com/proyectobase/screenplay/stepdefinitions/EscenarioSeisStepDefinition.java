package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.constants.Constantes;
import co.com.proyectobase.screenplay.tasks.AgregarProductoConColor;
import co.com.proyectobase.screenplay.tasks.IrACarritoDeCompras;
import co.com.proyectobase.screenplay.tasks.Navegar;
import co.com.proyectobase.screenplay.ui.PaginaProducto;
import co.com.proyectobase.screenplay.ui.PaginaResultados;
import co.com.proyectobase.screenplay.ui.VentanaEmergente;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import java.util.concurrent.Callable;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static co.com.proyectobase.screenplay.ui.PaginaProducto.*;
import static co.com.proyectobase.screenplay.ui.VentanaEmergente.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.CoreMatchers.is;

public class EscenarioSeisStepDefinition {
    @Given("que {word} esta comprando un producto en myStore")
    public void queUsuarioEstaComprandoUnProductoEnMyStore(String actorNamed) {
        // Write code here that turns the phrase above into concrete actions
        actor.assignName(actorNamed);
        actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_PRODUCTO));
    }
    @When("agrega el producto seleccionado al carrito")
    public void agregaElProductoSeleccionadoAlCarrito() {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(AgregarProductoConColor.enElCarrito());
    }
    @When("voy al carrito de compras y elimino el producto")
    public void voyAlCarritoDeComprasYEliminoElProducto() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(Click.on(CERRAR_VENTANA), IrACarritoDeCompras.eliminarProducto());
        actor.should(eventually(seeThat(the(PRODUCTO_VACIO), isVisible())).waitingForNoLongerThan(40).seconds());
    }
    @When("lo vuelvo agregar al carrito de compras")
    public void loVuelvoAgregarAlCarritoDeCompras() throws InterruptedException {
        actor.should(eventually(seeThat(the(PRODUCTO_VACIO), containsText("(empty)") )).waitingForNoLongerThan(40).seconds());
        actor.attemptsTo(AgregarProductoConColor.enElCarrito());
    }
    @Then("deberia ver que el carrito contenga el producto")
    public void deberiaVerQueElCarritoContengaElProducto() throws InterruptedException {

        actor.should(eventually(seeThat(the(VentanaEmergente.TITULO_DE_RESULTADO_DOS),containsText("Product successfully added to your shopping cart"))).waitingForNoLongerThan(30).seconds());
        actor.attemptsTo(Click.on(CERRAR_VENTANA));
        actor.should(eventually(seeThat(the(PaginaProducto.PRODUCTO_EN_EL_CARRITO_DE_COMPRAS), containsText("1"))).waitingForNoLongerThan(30).seconds());


    }
}
