import com.intuit.karate.junit5.Karate;

public class PetRunner {

    @Karate.Test
    Karate testRunner() {
        return Karate.run("classpath:manage_pet.feature");
        //return Karate.run("classpath:manage_pet.feature@eliminar");
    }
}
