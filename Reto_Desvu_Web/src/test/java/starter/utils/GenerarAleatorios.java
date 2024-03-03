package starter.utils;

import net.andreinc.mockneat.types.enums.NameType;

import static net.andreinc.mockneat.unit.regex.Regex.regex;
import static net.andreinc.mockneat.unit.user.Names.names;

public class GenerarAleatorios {

    public static String randomFirstName() {
        return names().type(NameType.FIRST_NAME).get();
    }
    public static String randomLastName() {
        return names().type(NameType.LAST_NAME).get();
    }

    public static String randomZipCode(){
        String numberRegex = "\\d{6}";
       return regex(numberRegex).get();
    }
}
