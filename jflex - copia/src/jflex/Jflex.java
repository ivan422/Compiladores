package jflex;

import java.io.File;

public class Jflex {

    public static void main(String[] args) throws Exception {
        try {
            generarLexer();
        } catch (Exception e) {
            throw new Exception("Error al generar Archivo Lexer");
        }
    }

    public static void generarLexer() throws Exception {
        // Ruta del archivo donde se encuentra el archivo lex.flex
        String[] ruta = {"C:\\Users\\ivanb\\OneDrive\\Documentos\\NetBeansProjects\\jflex\\src\\jflex\\lex.flex"};
        try {
            jflex.Main.generate(ruta);
        } catch (Exception e) {
            throw new Exception("Error al crear  Archivo Lexer.java ");
        }
    }

}
