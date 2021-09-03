package co.edu.utp.misiontic2022.c2;

/*
Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si la variable es par o impar.
Utiliza el operador condicional ( ? : ) para resolverlo
*/

import java.util.Scanner;

public class Ejercicio5 {
    
    public static String parImpar(int numero) {
        String verificar;

        verificar = (numero%2 == 0) ? "es par" : "es impar";

        return verificar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero: ");
        int numero = sc.nextInt();

        String resultado = parImpar(numero);
        System.out.println("\n" + "El número " + numero + " " + resultado + "\n");

        sc.close();
    }
}
