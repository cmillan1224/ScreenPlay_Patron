package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.proyectobase.screenplay.ui.PaginaProducto.*;

public class AgregarProductoConColor implements Task {
    public AgregarProductoConColor() {
    }

    public static Performable enElCarrito() {
        return new AgregarProductoConColor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_COLOR),
                Click.on(AGREGAR_CANTIDAD_AL_CARRITO)
        );
    }
}
