package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResultados {
    public static Target PRODUCTO_A_SELECCIONAR = Target.the("Tarjeta de Producto").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line:nth-child(1) div.product-container div.left-block div.product-image-container > a.product_img_link"));
    public static Target SEGUNDO_PRODUCTO_A_SELECCIONAR = Target.the("Tarjeta de Producto").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-item-of-tablet-line:nth-child(5) > div.product-container"));
    public static Target AGREGAR_AL_CARRITO = Target.the("Añadir al carrito").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line:nth-child(1) div.product-container div.right-block div.button-container:nth-child(4) > a.button.ajax_add_to_cart_button.btn.btn-default:nth-child(1)"));
    public static Target SEGUNDO_AGREGAR_AL_CARRITO = Target.the("Añadir al carrito").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(3) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-item-of-tablet-line.hovered:nth-child(5) div.product-container div.right-block div.button-container:nth-child(4) a.button.ajax_add_to_cart_button.btn.btn-default:nth-child(1) > span:nth-child(1)"));
    public static Target CONTINUAR_COMPRANDO = Target.the("Conitunar comprando").located(By.cssSelector("body.search.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) span.continue.btn.btn-default.button.exclusive-medium > span:nth-child(1)"));
}
