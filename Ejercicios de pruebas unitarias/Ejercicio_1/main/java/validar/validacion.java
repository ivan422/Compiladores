package validar;

public class validacion {

    public static void main(String[] args) {
        validacion resultado = new validacion();
        System.out.println(resultado.numero(5));
    }
    
    public boolean numero(int num) {
        return num <= 0;
    }

}
