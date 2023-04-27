package co.com.proyectobase.screenplay.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Flotar implements Interaction {
    private Target target;
    public Flotar(Target target){
        this.target = target;
    }

    public static Performable sobre(Target target){
        return new Flotar(target);
    }

    @Override
    @Step("{0} flota sobre el elemento #target")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(target));
    }
}
