package co.com.proyectobase.screenplay.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static Target SEARCH = Target.the("Buscador pagina").located(By.id("search_query_top"));
}
