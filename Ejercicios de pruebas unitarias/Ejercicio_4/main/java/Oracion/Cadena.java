package Oracion;

import java.util.StringTokenizer;

public class Cadena {

    int cantidad;

    public int contarpalabras(String oracion) {
        StringTokenizer cont = new StringTokenizer(oracion);
        cantidad = cont.countTokens();
        return cantidad;
    }

}
