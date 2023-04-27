package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.PaginaProducto.AGREGAR_CANTIDAD_AL_CARRITO;

public class AgregarCantidadProductos implements Task {

    public AgregarCantidadProductos() {
    }

    public static Performable alCarrito() {
        return new AgregarCantidadProductos();
    }

    @Override
    @Step("{0} Agrega la cantidad del producto al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AGREGAR_CANTIDAD_AL_CARRITO));
    }
}
