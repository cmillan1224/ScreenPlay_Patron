package co.com.proyectobase.screenplay.hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TheStage {

    @Before
    public void setTheStage(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

}
