package TestTienda;

import Tienda.comprar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class tienditatest {

    comprar tazas = new comprar();

    @Test
    public void testtazas1() {
        assertEquals(7, tazas.numtazas(6));
    }

    @Test
    public void testtazas12() {
        assertEquals(248, tazas.numtazas(213));
    }

    @Test
    public void testtazas3() {
        assertEquals(14, tazas.numtazas(12));
    }
}
