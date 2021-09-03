package co.edu.utp.misiontic2022.c2;

/*
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio
*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio;
        int numeroEscogido;
        int i;
        

        numeroAleatorio = (int)((Math.random()*100) + 1);

        System.out.println("Ingrese un número: ");
        numeroEscogido = sc.nextInt();

        for (i = 0; i <= 100; i++) {
            if (numeroAleatorio == numeroEscogido) {
                System.out.println("¡Acertaste! Requeriste " + i + " intentos para adivinar el número");
            break; } 


            else if (i == 100) {
                System.out.println("Lo siento, has perdido. El número era el: " + numeroAleatorio);
            break ; } 


            else if (numeroAleatorio > numeroEscogido) 
                System.out.println("El número que busca es mayor que " + numeroEscogido);
            else if (numeroAleatorio < numeroEscogido) 
                System.out.println("El número que busca es menor que " + numeroEscogido);

            
            if (i <= 1) {
                System.out.println("Otro intento");
                numeroEscogido = sc.nextInt(); }
            else if ( i >= 3) {
                System.out.println("Sigue intentando");
                numeroEscogido = sc.nextInt(); }

                
                sc.equals(sc);
        }  
        
    }
    
}