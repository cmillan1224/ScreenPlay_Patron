package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProducto {

    public static Target BOTON_MAS_PRODUCTO = Target.the("Boton aumentar producto").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]"));
    public static Target AGREGAR_CANTIDAD_AL_CARRITO = Target.the("Boton Add to cart").located(By.xpath("//span[contains(text(),'Add to cart')]"));
    public static Target LISTA_DESPLEGABLE_TALLA = Target.the("Lista de tallas").located(By.xpath("//select[@id='group_1']"));
    public static Target SELECCIONAR_COLOR = Target.the("Seleccionar Color").located(By.xpath("//a[@id='color_14']"));
    public static Target LISTA_CARRITO_DE_COMPRAS = Target.the("Lista carrito de compras").located(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]"));
    public static Target ELIMINAR_PRODUCTO = Target.the("Eliminar Producto del carrito").located(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/dl[1]/dt[1]/span[1]/a[1]"));

    public static Target PRODUCTO_EN_EL_CARRITO_DE_COMPRAS = Target.the("Producto en el carrito").located(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]"));
    public static Target PRODUCTO_VACIO = Target.the("Sin producto").located(By.xpath("//span[contains(text(),'(empty)')]"));
}
