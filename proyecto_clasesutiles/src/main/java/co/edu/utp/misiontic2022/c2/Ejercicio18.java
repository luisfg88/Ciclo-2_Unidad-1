package co.edu.utp.misiontic2022.c2;

/*
Programa que lea un número entero y cambie el 3
por la letra E
*/

import java.util.Scanner;

public class Ejercicio18 {
        
    public static String cambiarDigito(String numero){
        String cambiar = "";

        if (numero.contains("3")) {
            cambiar = numero + " se modificó --> " + numero.replace("3", "E");
        } else {
            cambiar = "No se modificó --> " + numero;
        }

        return cambiar;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número de 5 cifras");
        String numero = sc.nextLine();

        String resultado = cambiarDigito(numero);
        System.out.println("\n" + resultado + "\n");
        
       sc.close();
    }
}
