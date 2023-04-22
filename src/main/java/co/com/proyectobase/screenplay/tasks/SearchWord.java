package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchWord implements Task {

    private final String palabra;

    public SearchWord(String palabra) {
        this.palabra = palabra;
    }

    public static SearchWord the(String palabra){
        return new SearchWord(palabra);
    }

    @Override
    @Step("{0} buscar la palabra parametrizada")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(palabra).into(GooglePage.TEXT_BUSCAR),
                Click.on(GooglePage.BTN_BUSCAR)
        );
    }
}
