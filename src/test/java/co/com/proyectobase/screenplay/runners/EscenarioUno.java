package co.com.proyectobase.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/agregarProducto.feature",
        glue={"co.com.proyectobase.screenplay.stepdefinitions.EscenarioUnoStepDefinition","co.com.proyectobase.screenplay.hooks"},
        tags = "@TestCaseOne",
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class EscenarioUno {
}
