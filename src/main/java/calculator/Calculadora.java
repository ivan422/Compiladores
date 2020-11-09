package calculator;

public class Calculadora {

    public static void main(String[] args) {
        operaciones operacion1 = new operaciones();
        System.out.println("La suma es : " + operacion1.suma(5, 3));
        System.out.println("La resta es : " + operacion1.resta(5, 3));
        System.out.println("La multiplicacion es : " + operacion1.multiplicacion(5, 3));
        System.out.println("La division es : " + operacion1.division(5, 3));
        System.out.println("La exponenciación es : " + operacion1.exponenciacion(5, 3));
    }
}
