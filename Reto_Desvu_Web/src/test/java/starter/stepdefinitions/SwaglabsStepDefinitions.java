package starter.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import org.hamcrest.Matchers;
import starter.questions.ElResultado;
import starter.tasks.AgregarProducto;
import starter.tasks.ComprarProductos;
import starter.tasks.IniciarSesion;
import starter.tasks.navegacion.AbrirNavegador;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.userInterface.ElementosConfirmacionCompras.MENSAJE_COMPRA_EXITOSA;

public class SwaglabsStepDefinitions {

    @Dado("que {actor} ingresa a la pagina")
    public void queElUsuarioIngresaALaPagina(Actor actor) {
        actor.wasAbleTo(AbrirNavegador.enLaPaginaPrincipal());
    }

    @Dado("ingresa con las credenciales: {string} y {string}")
    public void ingresaConLasCredencialesY(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enSwaglabs(usuario, contrasena));
    }

    @Cuando("el agrega los productos: {string} y {string} al carrito")
    public void elAgregaLosProductosYAlCarrito(String nombreProductoUno, String nombreProductoDos) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito(nombreProductoUno,nombreProductoDos)
        );
    }

    @Cuando("finaliza el proceso de compra")
    public void finalizaElProcesoDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                ComprarProductos.seleccionados()
        );
    }

    @Entonces("el puede vel el mensaje {string}")
    public void elPuedeVelElMensaje(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(ElResultado.para(MENSAJE_COMPRA_EXITOSA), Matchers.is(mensaje))
        );
    }

}
