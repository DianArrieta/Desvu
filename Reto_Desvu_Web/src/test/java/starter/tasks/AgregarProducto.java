package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.userInterface.ElementosPaginaInventario;

import static starter.userInterface.ElementosPaginaInventario.CARRITO;

public class AgregarProducto {

    public static Performable alCarrito(String nombreProductoUno,String nombreProductoDos){
        return Task.where(" {0} intenta agregar producto al carrito de compras",
                Click.on(ElementosPaginaInventario.agregarAlCarrito(nombreProductoUno)),
                Click.on(ElementosPaginaInventario.agregarAlCarrito(nombreProductoDos)),
                Click.on(CARRITO)
                );
    }
}
