package starter.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaInventario {

    public static String SELECTOR_PRODUCTO = "//div[contains(text(),'%s')]/ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']/button";
    public static Target CARRITO = Target.the("Botón agregar al carrito").located(By.className("shopping_cart_badge"));

    public static Target agregarAlCarrito(String nombreProducto){
        return Target.the("Botón para agregar un carrito al producto").located(By.xpath(String.format(SELECTOR_PRODUCTO,nombreProducto)));
    }


}
