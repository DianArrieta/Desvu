package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ElResultado {
    public static Question<String> para(Target localizador) {
        WaitUntil.the(localizador, isNotVisible()).forNoMoreThan(1).milliseconds();
        return actor -> TextContent.of(localizador).answeredBy(actor).trim();
    }
}
