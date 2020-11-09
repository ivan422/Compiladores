package validacion;

import validar.validacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class numTest {

    validacion val = new validacion();

    @Test
    public void testvalidar1() {
        assertEquals(false, val.numero(2));
    }
    
    @Test
    public void testvalidar2() {
        assertEquals(true, val.numero(-1));
    }
    
    @Test
    public void testvalidar3() {
        assertEquals(false, val.numero(5));
    }
}
