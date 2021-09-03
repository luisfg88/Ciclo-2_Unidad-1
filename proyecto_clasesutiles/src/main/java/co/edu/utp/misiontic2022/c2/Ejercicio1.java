package co.edu.utp.misiontic2022.c2;

/*
Programa que pida por teclado la fecha de nacimiento de una persona 
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha 
de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 
28
Número de la suerte: 28
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static int numeroSuerte(int dia, int mes, int anio){
    
        int sumarFecha = dia + mes + anio;

        int cifra1 = sumarFecha/1000;
        int cifra2 = sumarFecha/100%10;
        int cifra3 = sumarFecha/10%10;
        int cifra4 = sumarFecha%10;

        int sumaTotal = cifra1 + cifra2 + cifra3 + cifra4;

        return sumaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.println("Ingrese su año de nacimiento: ");
        int anio = sc.nextInt();

        int suerte = numeroSuerte(dia, mes, anio);
        System.out.println("\n" + dia + "/" + mes + "/" + anio + " --> " + " Su número de la suerte es " + suerte + "\n");

        sc.close();
    }

    
    
}
