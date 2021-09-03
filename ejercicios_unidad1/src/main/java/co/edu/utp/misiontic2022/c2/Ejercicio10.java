package co.edu.utp.misiontic2022.c2;

/*
Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89
*/

import java.util.Scanner;

public class Ejercicio10 {

    public static void serieFibonacci(int numero){

        //Usando la ecuación de Binet podemos hallar la serie de Fibonacci

        double Binet = 0;
        double proporcionAurea = 1.618034;

        System.out.println("\n" + "Serie Fibonacci");

        for(int i = 0; i <= numero; i++){
            Binet = ((Math.pow(proporcionAurea, i))-(Math.pow(1-proporcionAurea, i)))/(Math.sqrt(5));
            System.out.println(Math.round(Binet));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de los N números de la serie Fibonacci: ");
        int numero = sc.nextInt();

        serieFibonacci(numero);
        
        sc.close();
    }
    
}
