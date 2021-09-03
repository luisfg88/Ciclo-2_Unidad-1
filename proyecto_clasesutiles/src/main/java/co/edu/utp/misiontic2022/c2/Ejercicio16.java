package co.edu.utp.misiontic2022.c2;

/*
Programa que muestre en líneas separadas lo siguiente: 
ZYWXVUTSRQPONMLKJIHGFEDCBA
YWXVUTSRQPONMLKJIHGFEDCBA
WXVUTSRQPONMLKJIHGFEDCBA
....
DCBA
CBA
BA
A
*/

import java.util.Scanner;

public class Ejercicio16 {
    
    public static void separadas() {
        char i;
        char j;
        for (i = 'Z'; i >= 'A'; i--) {
            for (j = i ; j >= 'A'; j--) {
            System.out.print(j);
            }
            System.err.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        separadas();

        sc.close();
    }
}
