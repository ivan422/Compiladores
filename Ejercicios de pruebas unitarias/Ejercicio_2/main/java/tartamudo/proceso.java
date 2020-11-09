package tartamudo;

public class proceso {

    String resultado = "";

    public String tartamudear(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            String letra1 = palabra.substring(0, 2);
            String letra2 = palabra.substring(2);
            resultado = letra1 + "... " + letra1 + "... " + letra2 + "?";

        }
        return resultado;

    }

}
