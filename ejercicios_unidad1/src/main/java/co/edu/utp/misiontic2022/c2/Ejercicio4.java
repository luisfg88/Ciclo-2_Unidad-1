package co.edu.utp.misiontic2022.c2;

/*
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void tablaMultiplicar(int numero) {

        System.out.println("\n" + "Tabla de multiplicar del " + numero);

        for (int i = 1; i <= 9; i++) {
            int tabla = numero * i;
            System.out.println(numero + "x" + i + " = " + tabla);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de la tabla de multplicar que necesita: ");
        int numero = sc.nextInt();

        tablaMultiplicar(numero);

        sc.close();
    }
    
}
