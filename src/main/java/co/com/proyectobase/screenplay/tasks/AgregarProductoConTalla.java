package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.PaginaProducto.AGREGAR_CANTIDAD_AL_CARRITO;
import static co.com.proyectobase.screenplay.ui.PaginaProducto.LISTA_DESPLEGABLE_TALLA;

public class AgregarProductoConTalla implements Task {


    public AgregarProductoConTalla() {
    }

    public static Performable enElCarrito() {
        return new AgregarProductoConTalla();
    }


    @Override
    @Step("{0} agrega el producto con una talla especifica")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("M").from(LISTA_DESPLEGABLE_TALLA),
                Click.on(AGREGAR_CANTIDAD_AL_CARRITO)
        );
    }
}
