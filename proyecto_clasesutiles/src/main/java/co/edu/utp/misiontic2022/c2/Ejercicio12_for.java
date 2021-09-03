package co.edu.utp.misiontic2022.c2;

/*
Realizar programa que muestre los números del 1 al 100 que no
sean múltiplos de 3, utilizando cada una las instrucciones
repetitivas (for)
*/

import java.util.Scanner;

public class Ejercicio12_for {

    public static void numeros1_100(){
        
        for (int i = 0; i <= 100; i++) {
            if (i%3 != 0) {
                System.out.println(i);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        numeros1_100();

        sc.close();
    }
    
}
