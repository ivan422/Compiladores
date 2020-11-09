package test;

import Oracion.Cadena;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Oraciontest {

    Cadena palabras = new Cadena();

    @Test
    public void testoracion1() {
        assertEquals(7, palabras.contarpalabras("aqui se pone en prueba el método"));
    }
    
     @Test
    public void testoracion2() {
        assertEquals(5, palabras.contarpalabras("buenos dias tengan todos ustedes"));
    }
    
     @Test
    public void testoracion3() {
        assertEquals(4, palabras.contarpalabras("esta es una prueba"));
    }
}
