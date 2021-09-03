package co.edu.utp.misiontic2022.c2;

/*
Programa que lea dos números y muestre el
resultado de la división del primer número por el segundo. Se
debe comprobar que el divisor no puede ser cero
*/

import java.util.Scanner;

public class Ejercicio8 {

    public static void divisionNumeros(double dividendo, double divisor){
        
        double operacionDivision;
        String mensaje;

        if(divisor != 0){
            operacionDivision = dividendo/divisor;
            System.out.println("\n"+ dividendo + "/" + divisor + " --> " + operacionDivision + "\n");
            
        }else{
            mensaje = "¡Error! El divisor no puede ser cero. Ingrese otro número";
            System.out.println("\n" + mensaje + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el dividendo: ");
        double dividendo = sc.nextDouble();

        System.out.println("Digite el divisor: ");
        double divisor = sc.nextDouble();

       divisionNumeros(dividendo, divisor);

        sc.close();
    }

}

