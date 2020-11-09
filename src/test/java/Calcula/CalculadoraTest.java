package Calcula;


import calculator.operaciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    
    operaciones calculator1 = new operaciones();

    @Test
    public void testSuma1() {
        assertEquals(5, calculator1.suma(2, 3));
    }

    @Test
    public void testSuma2() {
        assertEquals(6, calculator1.suma(3, 3));
    }

    @Test
    public void testResta1() {
        assertEquals(6, calculator1.resta(8, 2));
    }

    @Test
    public void testResta2() {
        assertEquals(7, calculator1.resta(8, 1));
    }
    
    @Test
    public void testMultiplicacion1() {
        assertEquals(6, calculator1.multiplicacion(2, 3));
    }
    
    @Test
    public void testMultiplicacion2() {
        assertEquals(9, calculator1.multiplicacion(3, 3));
    }
    
    @Test
    public void testDivision1() {
        assertEquals(5, calculator1.division(15, 3));
    }
    
    @Test
    public void testDivision2() {
        assertEquals(4, calculator1.division(12, 3));
    }
    
    @Test
    public void testExponenciacion1() {
        assertEquals(125, calculator1.exponenciacion(5, 3));
    }
    
    @Test
    public void testExponenciacion2() {
        assertEquals(64, calculator1.exponenciacion(4, 3));
    }
}

