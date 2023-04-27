package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {
    private final String opcionDeURL;
    public Navegar(String opcionDeURL){
        this.opcionDeURL = opcionDeURL;
    }
    public static Performable hacia(String opcionURL){
        return Instrumented.instanceOf(Navegar.class).withProperties(opcionURL);
    }
    @Override
    @Step("{0} Navega hacia una pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(opcionDeURL));
    }
}
