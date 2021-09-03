package co.edu.utp.misiontic2022.c2;

/*
Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
*/

import java.util.Scanner;

public class Ejercicio4 {

    public static double conversionC_F(double temperaturaC) {
        double temperaturaF;

        temperaturaF = 32 + ((9 * temperaturaC) / 5);

        return temperaturaF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double temperaturaC = sc.nextDouble();

        double temperatura = conversionC_F(temperaturaC);
        System.out.println("\n" + temperaturaC + "°C = " + temperatura + "°F");

        sc.close();
    }
    
}
