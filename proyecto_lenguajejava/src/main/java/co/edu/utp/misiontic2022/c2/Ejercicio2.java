package co.edu.utp.misiontic2022.c2;

/*
Implemente un algoritmo que reciba un número por
teclado y cuente cuántas cifras (o dígitos) contiene e
imprima el mensaje en consola
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static int contadorCifras(int numero) {

        System.out.println("\n");
        int i;
        for (i = 0; numero != 0; i++) {
            numero = numero/10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int numero = sc.nextInt();

        int contador = contadorCifras(numero);
        System.out.println("El número ingresado tiene " + contador + " cifras");

        sc.close();
    }
    
}
