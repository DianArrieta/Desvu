package starter.tasks.navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador {
    public static Performable enLaPaginaPrincipal() {
        return Task.where("{0} abre la pagina principal de SwagLabs",
                Open.browserOn().the(PaginaPrincipal.class));
    }
}
