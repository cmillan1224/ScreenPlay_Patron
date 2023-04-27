package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VentanaEmergente {
    public static final Target TITULO_CANTIDAD_DE_PRODUCTOS = Target.the("Mensaje Cantidad de productos").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div:nth-child(4) div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 h2:nth-child(1) > span.ajax_cart_product_txt_s"));
    public static final Target CARRITO_CANTIDAD_DE_PRODUCTOS = Target.the("Cantidad de productos en el carrito").located(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/h2[1]/span[1]"));
    public static Target TITULO_DE_RESULTADO = Target.the("Tarjeta de Producto").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div:nth-child(4) div.clearfix div.layer_cart_product.col-xs-12.col-md-6 > h2:nth-child(2)"));
    public static Target TITULO_DE_RESULTADO_DOS = Target.the("Tarjeta de Producto").located(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]"));
    public static Target RESULTADO_DE_TALLA_Y_COLOR = Target.the("Talla del producto").located(By.xpath("//span[@id='layer_cart_product_attributes']"));
    public static Target CERRAR_VENTANA = Target.the("Cerrar ventana emergente").located(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));

}
