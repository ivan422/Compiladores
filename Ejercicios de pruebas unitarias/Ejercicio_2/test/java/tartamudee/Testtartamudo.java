package tartamudee;

import tartamudo.proceso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testtartamudo {

    proceso palabra = new proceso();

    @Test
    public void teststutter1() {
        assertEquals("ac... ac... tividades?", palabra.tartamudear("actividades"));
    }

    @Test
    public void teststutter2() {
        assertEquals("in... in... credible?", palabra.tartamudear("incredible"));
    }

    @Test
    public void teststutter3() {
        assertEquals("mo... mo... nolito?", palabra.tartamudear("monolito"));
    }

}
