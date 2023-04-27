package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.actions.Flotar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.PaginaResultados.*;

public class AgregarMultiplesProductos implements Task {

    public AgregarMultiplesProductos() {
    }

    public static Performable alCarrito() {
        return new AgregarMultiplesProductos();
    }

    @Override
    @Step("{0} agrega varios productos al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Flotar.sobre(PRODUCTO_A_SELECCIONAR),
                Click.on(AGREGAR_AL_CARRITO),
                Click.on(CONTINUAR_COMPRANDO),
                Flotar.sobre(SEGUNDO_PRODUCTO_A_SELECCIONAR),
                Click.on(SEGUNDO_AGREGAR_AL_CARRITO)
        );
    }
}
