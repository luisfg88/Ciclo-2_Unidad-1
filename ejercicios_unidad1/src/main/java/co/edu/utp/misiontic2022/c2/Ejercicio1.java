package co.edu.utp.misiontic2022.c2;

/*
Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”
*/

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void operaciones(double numero1, double numero2) {

        double suma;
        double resta;
        double multiplicacion;

        System.out.println("\n" + "Operaciones matemáticas");

        suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        

        resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        

        multiplicacion = numero1 * numero2; 
        System.out.println(numero1 + " x " + numero2 + " = " + multiplicacion);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Por favor ingrese otro número: ");
        double numero2 = sc.nextDouble();

        operaciones(numero1, numero2);

        sc.close();
    }
}
