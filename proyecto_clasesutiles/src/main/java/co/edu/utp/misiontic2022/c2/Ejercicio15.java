package co.edu.utp.misiontic2022.c2;

//Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N

import java.util.Scanner;

public class Ejercicio15 {
    
    public static int sumaFactoriales(int numero){
        int acumulador = 1;
        int suma = 1;

        for (int i = 1; i <= numero; i++) {
            acumulador = acumulador * i;
            suma = suma + acumulador;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el número para calcular la sumatoria de los factoriales de 0 a N: ");
        int numero = sc.nextInt();

        int factorial = sumaFactoriales(numero);
        System.out.println("\n" + "La suma de los factoriales de 0 a " + numero);
        System.out.println("Ʃ" + numero + "! = " + factorial +  "\n");

        sc.close();
    }
}
