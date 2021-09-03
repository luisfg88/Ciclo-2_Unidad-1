package co.edu.utp.misiontic2022.c2;

/*
Programa que lea la longitud de los catetos de un triángulo rectángulo y
calcule la longitud de la hipotenusa según el teorema de Pitágoras
*/

import java.util.Scanner;


public class Ejercicio5 {
    
    public static double hipotenusa( double catetoOpuesto, double catetoAdyacente){
        double longitudHipotenusa = Math.sqrt(Math.pow(catetoOpuesto, 2) + Math.pow(catetoAdyacente, 2));
        return longitudHipotenusa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte el valor del cateto opuesto:");
        double catetoOpuesto = sc.nextDouble();

        System.out.println("Inserte el valor del cateto adyacente:");
        double catetoAdyacente = sc.nextDouble();

        double longitud = hipotenusa(catetoOpuesto, catetoAdyacente);
        System.out.println("La longitud de la hipotenusa es " + longitud);

        sc.close();
    }


}
