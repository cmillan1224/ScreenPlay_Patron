package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.actions.Flotar;
import co.com.proyectobase.screenplay.hooks.TheStage;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static co.com.proyectobase.screenplay.ui.PaginaResultados.*;

public class AgregarProducto implements Task {

    public AgregarProducto(){}
    public static Performable alCarrito() {
        return new AgregarProducto();
    }

    @Override
    @Step("{0} agregar el producto al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Flotar.sobre(PRODUCTO_A_SELECCIONAR),
                Click.on(AGREGAR_AL_CARRITO)
        );
    }
}
