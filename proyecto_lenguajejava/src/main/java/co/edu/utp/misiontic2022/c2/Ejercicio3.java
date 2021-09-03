package co.edu.utp.misiontic2022.c2;

/*
Escribe un programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número
*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void dobleTriple(int numero) {
        int dobleNumero;
        int tripleNumero;

        dobleNumero = 2 * numero;
        System.out.println("\n" + "El doble de " + numero+ " es " +dobleNumero);

        tripleNumero = 3 *numero;
        System.out.println("El triple de " + numero+ " es " +tripleNumero);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero entero: ");
        int numero = sc.nextInt();

        dobleTriple(numero);

        sc.close();
    }
    
}
