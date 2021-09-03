package co.edu.utp.misiontic2022.c2;

/*
Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/

import java.util.Scanner;

public class Ejercicio3 {
    
    public static int sueldoTrabajdor(int horasTrabajadas) {
        int sueldo;

        sueldo = horasTrabajadas * 30000;

        return sueldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = sc.nextInt();

        int resultado = sueldoTrabajdor(horasTrabajadas);
        System.out.println("\n" + "El sueldo mensual del trabajador es --> " + resultado + "\n");

        sc.close();
    }
}
