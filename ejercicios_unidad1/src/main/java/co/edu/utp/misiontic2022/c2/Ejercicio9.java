package co.edu.utp.misiontic2022.c2;

/*
Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
*/

import java.util.Scanner;

public class Ejercicio9 {

    public static void comprobarSalario(String nombre, int edad, int salario) {

        System.out.println("\n" + "Salario ajustado por edad");
        
        if(edad < 16){
            String comprobar = "No tiene edad para trabajar";
            System.out.println(comprobar);
        }else if(edad >= 19 && edad <= 50){
            int comprobar = salario + (int)Math.round(salario * 0.05);
            System.out.println("$ " + comprobar);
        }else if(edad > 50 && edad <= 60){
            int comprobar = salario + (int)Math.round(salario * 0.1);
            System.out.println("$ " + comprobar);
        }else if(edad > 60){
            int comprobar = salario + (int)Math.round(salario * 0.15);
            System.out.println("$ " + comprobar);
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese su salario: ");
        int salario = sc.nextInt();

        comprobarSalario(nombre, edad, salario);

        sc.close();
    }
    
}
