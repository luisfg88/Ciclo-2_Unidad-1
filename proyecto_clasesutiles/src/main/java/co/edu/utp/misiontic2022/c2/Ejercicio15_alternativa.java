package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio15_alternativa {
    
    public static void sumaFactoriales(int numero){
        long acumulador = 1;
        long suma = 1;

        System.out.println("\n" + "La suma de los factoriales de 0 a " + 20);

        for (int i = 1; i <= numero; i++) {
            acumulador = acumulador * i;
            suma = suma + acumulador;
            System.out.println("Ʃ" + i + "! = " + suma );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el número para calcular la sumatoria de los factoriales de 0 a N: ");
        int numero = sc.nextInt();

        sumaFactoriales(numero);

        sc.close();
    }


}
