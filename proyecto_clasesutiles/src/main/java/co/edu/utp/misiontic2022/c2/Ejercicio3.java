package co.edu.utp.misiontic2022.c2;

/*
Programa que lea dos variables enteras N y m y le quite a N sus m últimas
cifras.
Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
*/

import java.util.Scanner;

public class Ejercicio3 {

    public static int quitarCifras(int N, int m){
        int reductor;

        reductor = N / (int)Math.pow(10, m);

        return reductor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte el valor de N: ");
        int N = sc.nextInt();

        System.out.println("Inserte el valor de m: ");
        int m= sc.nextInt();

        int resultado = quitarCifras(N, m);
        System.out.println("El nuevo valor es " + resultado);

        sc.close();
    }
    
}
