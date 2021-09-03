package co.edu.utp.misiontic2022.c2;

/*
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar
*/

import java.util.Scanner;

public class Ejercicio7 {
    
    public static String numeroPrimo(int numero) {
        int acumulador = 1;
        String mensaje = "";


        for (int i = 2; i <= numero; i++) {
            acumulador = (acumulador * (i - 1));
            if((acumulador+1)%numero == 0){
                mensaje = numero + " --> " + "Es un número primo";
            }else{
                mensaje = numero + " --> " + "Es un número compuesto";
            }
        }
        

        if(numero == 1){
            mensaje = numero + " --> " + "No es un número primo ni compuesto";
        }

        return mensaje;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero para saber si es primo: ");
        int numero = sc.nextInt();

        String primo = numeroPrimo(numero);
        System.out.println("\n" + primo + "\n");
        System.out.println("¿Quiere introducir más (S/N) y volver a pensar?" + "\n");

        sc.close();
    }
}
