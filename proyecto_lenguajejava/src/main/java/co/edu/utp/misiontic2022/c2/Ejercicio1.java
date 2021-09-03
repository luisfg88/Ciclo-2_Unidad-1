package co.edu.utp.misiontic2022.c2;

/*
Implemente un algoritmo que dado un
nombre en una variable de tipo cadena,
imprima un saludo en consola.
*/

public class Ejercicio1 {
    
    public static String saludar(String nombre) {
        String saludo = "Hola " + nombre;

        return saludo;
    }

    public static void main(String[] args) {

        String nombre = "Tripulante P74";

        String saludoCompleto = saludar(nombre);

        System.out.println(saludoCompleto);

    }
}
