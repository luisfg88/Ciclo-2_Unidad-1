package co.edu.utp.misiontic2022.c2;

/*
Programa que lee tres número enteros y calcula 
y muestra cuál es el mayor de los tres
*/

import java.util.Scanner;

public class Ejercicio9 {

    public static int numeroMayor(int n1, int n2, int n3){
        int mayor;

        if(n1 > n2 && n1 > n3){
            mayor = n1;
        }else if(n2 > n1 && n2 > n3){
            mayor =n2;
        }else{
            mayor = n3;
        }

        return mayor;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero entero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite el segundo numero entero: ");
        int n2 = sc.nextInt();

        System.out.println("Digite el tercer numero entero: ");
        int n3 = sc.nextInt();

        int resultado = numeroMayor(n1, n2, n3);
        System.out.println("El numero mayor es " + resultado);

        sc.close();
    }
}
