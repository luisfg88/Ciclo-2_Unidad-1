package co.edu.utp.misiontic2022.c2;

/*
Programa que pase de pesos a dólares y viceversa
*/

import java.util.Scanner;

public class Ejercicio13 {

    public static void convertir(double peso, double dolar) {
        double pesoDolar;
        double dolarPeso;

        pesoDolar = peso * 0.00025805852;
        dolarPeso = dolar * 3875.09;

        System.out.println("\n" + peso + " pesos equivale a " + pesoDolar + " dolares");
        System.out.println(dolar + " dolares equivale a " + dolarPeso + " pesos");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la cantidad de pesos a convertir: ");
        double peso = sc.nextDouble();

        System.out.println("Inserte la cantidad de dolares a convertir: ");
        double dolar = sc.nextDouble();

        convertir(peso, dolar);

        sc.close();
        
    }
    
}
