/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author ivanb
 */
public class Token {

    private Tipos tipo;
    private String valor;

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Diccionario    
    enum Tipos {
        NUMERO("[0-9]+"),
        INICIO("BEGIN"),
        FIN("END"),
        OPERADOR("[+,-,*,/]"),
        RELACIONALES("[>=|<=|>|<|=|<>|{|}|[|]|(|)|,|;|.]"),
        RESERVADAS("program|if|else|for|while|case");
        public final String patron;

        Tipos(String s) {
            this.patron = s;
        }
    }
}
