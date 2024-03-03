package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.userInterface.ElementosPaginaInicioDeSesion.*;

public class IniciarSesion {
    public static Performable enSwaglabs(String usuario, String contrasena) {
        return Task.where("{0} inicia sesion en swaglabs",
                Enter.theValue(usuario).into(INICIAR_SESION),
                Enter.theValue(contrasena).into(CONTRASENA),
                Click.on(BOTON_INICIO_SESION)
        );
    }
}
