package co.edu.utp.misiontic2022.c2;

/*
Programa que lea un carácter y compruebe si es
una letra mayúscula
*/

import java.util.Scanner;

public class Ejercicio7 {

    public static String comprobarLetra(char letra){
        String comprobando;

        if(Character.isUpperCase(letra)){
            comprobando = "es una letra mayúscula";
        }else{
            comprobando = "es una letra minúscula";
        }

        return comprobando;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingrese una letra del abecedario: ");
        char letra = sc.findInLine(".").charAt(0);

        String mensaje = comprobarLetra(letra);
        System.out.println("\n" + letra + " " + mensaje +  "\n");

        sc.close();

    }
    
}
