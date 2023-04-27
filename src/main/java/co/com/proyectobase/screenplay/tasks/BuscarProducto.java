package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.PaginaPrincipal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;


public class BuscarProducto implements Task {
    private final String nombreDelProducto;
    public BuscarProducto(String nombreProducto){
        this.nombreDelProducto = nombreProducto;
    }

    public static Performable llamado(String nombreDelProducto) {
        return new BuscarProducto(nombreDelProducto);
    }

    @Override
    @Step("{0} busca el producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreDelProducto).into(PaginaPrincipal.SEARCH).thenHit(Keys.ENTER)
        );
    }
}
