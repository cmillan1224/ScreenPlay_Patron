package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.actions.Flotar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.ui.PaginaProducto.*;
import static co.com.proyectobase.screenplay.ui.PaginaResultados.PRODUCTO_A_SELECCIONAR;

public class Aumentar implements Task {
    private final Integer cantidad;

    public Aumentar(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public static Performable laCantidad(Integer cantidad) {
        return new Aumentar(cantidad);
    }

    @Override
    @Step("{0} Aumenta la cantidad de items para un producto")
    public <T extends Actor> void performAs(T actor) {
       // int can = cantidad
        for (int i =1; i<cantidad;i++) {
            actor.attemptsTo(
                    Click.on(BOTON_MAS_PRODUCTO));
        }

    }
}
