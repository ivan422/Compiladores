package calculator;

public class operaciones {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int exponenciacion(int a, int b) {
        int resultado = (int) Math.pow(a, b);
        return resultado;
    }
}
