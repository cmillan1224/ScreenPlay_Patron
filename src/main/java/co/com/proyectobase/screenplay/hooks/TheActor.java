package co.com.proyectobase.screenplay.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TheActor {

    public static Actor actor;

    @Managed
    public WebDriver hisBrowser;
    //public WebDriver hisBrowser = new FirefoxDriver();
    //public WebDriver hisBrowser = new EdgeDriver();
    @Before
    public void setTheActor(){

        actor = Actor.named("cristian");
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

}
