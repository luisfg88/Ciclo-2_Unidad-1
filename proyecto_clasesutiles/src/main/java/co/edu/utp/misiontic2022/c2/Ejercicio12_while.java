package co.edu.utp.misiontic2022.c2;

/*
Realizar programa que muestre los números del 1 al 100 que no
sean múltiplos de 3, utilizando cada una las instrucciones
repetitivas (while)
*/

import java.util.Scanner;

public class Ejercicio12_while {

    public static void numeros1_100(){
        int i = 0;

        while (i <= 100) {
            if (i%3 != 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        numeros1_100();
        
        sc.close();
    }
}
