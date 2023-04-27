package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.actions.Flotar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.PaginaProducto.*;

public class IrACarritoDeCompras implements Task {
    public IrACarritoDeCompras() {
    }

    public static Performable eliminarProducto() {
        return new IrACarritoDeCompras();
    }

    @Override
    @Step("{0} va a el carrito y elimina el producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Flotar.sobre(LISTA_CARRITO_DE_COMPRAS),
                Click.on(ELIMINAR_PRODUCTO)
        );
    }
}
