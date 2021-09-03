package co.edu.utp.misiontic2022.c2;

/*
Programa que lea un número entero y muestre si el número es
múltiplo de 10
*/

import java.util.Scanner;

public class Ejercicio6 {
    
    public static String multiploDiez(int numero){
        String verificar;
        if (numero%10 == 0) {
            verificar = "es múltiplo de 10";
        }else{
            verificar = "no es múltiplo de 10";
        }
    return verificar;

    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor inserte un numero entero:");
    int numero = sc.nextInt();

    String multiplo = multiploDiez(numero);
    System.out.println("El numero " + numero + " " + multiplo);

    sc.close();
}
}
