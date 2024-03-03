package starter.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaInicioDeSesion {
    public static final Target INICIAR_SESION = Target.the("Campo ingresar usuario").located(By.id("user-name"));

    public static final Target CONTRASENA = Target.the("Campo ingresar contraseña").located(By.id("password"));

    public static final Target BOTON_INICIO_SESION = Target.the("Boton login").located(By.id("login-button"));
}
