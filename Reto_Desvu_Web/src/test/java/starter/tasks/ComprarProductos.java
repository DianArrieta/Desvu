package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.utils.GenerarAleatorios;

import static starter.userInterface.ElementosConfirmacionCompras.*;

public class ComprarProductos {
    public static Performable seleccionados() {
        return Task.where("{0} intenta comprar los productos agregados en el carrito",
                Click.on(BOTON_CHECKOUT),
                Enter.theValue(GenerarAleatorios.randomFirstName()).into(FIRST_NAME),
                Enter.theValue(GenerarAleatorios.randomLastName()).into(LAST_NAME),
                Enter.theValue(GenerarAleatorios.randomZipCode()).into(ZIP_CODE),
                Click.on(BOTON_CONTINUE),
                Click.on(BOTON_FINISH)
        );
    }
}
