package co.edu.utp.misiontic2022.c2;

//Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E

import java.util.Scanner;

public class Ejercicio17 {
    
    public static void cambiarDigito() {
        int i;
        int j;
        int k;
        int l;
        int m;

        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                for (k = 0; k <= 9; k++) { 
                    for (l = 0; l <= 9; l++) {
                        for (m = 0; m <= 9; m++) {
                            if (i == 3) {
                                System.out.print("E");
                            }else{
                                System.out.print(i);
                            }

                            if (j == 3) {
                                System.out.print("E");
                            }else{
                                System.out.print(j);
                            }

                            if (k == 3) {
                                System.out.print("E");
                            }else{
                                System.out.print(k);
                            }

                            if (l == 3) {
                                System.out.print("E");
                            }else{
                                System.out.print(l);
                            }   

                            if (m == 3) {
                                System.out.println("E");
                            }else{
                                System.out.println(m);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cambiarDigito();

        sc.close();
    }
}
