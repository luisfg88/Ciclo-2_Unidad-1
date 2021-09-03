package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Alternativa_Ejercicio5 {

    public static String adivinarNumero(int numeroEscogido) {
        Scanner sc = new Scanner(System.in);

        String mensaje = "";
        int numeroAleatorio;
        int i;

        numeroAleatorio = (int)((Math.random()*100) + 1);


        for (i = 0; i <= 100; i++) {
            if (numeroAleatorio == numeroEscogido) {
                System.out.println("\n¡Acertaste! Requeriste " + i + " intentos para adivinar el número");
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
            else if ( i >= 2) {
                System.out.println("Sigue intentando");
                numeroEscogido = sc.nextInt(); }

            
            sc.equals(sc);
        }

        return mensaje;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Adivina el número desconcido");

        System.out.println("Digite un número: ");
        int numeroEscogido = sc.nextInt();

        String resultado = adivinarNumero(numeroEscogido);
        System.out.println("\n" + resultado + "\n");

        sc.close();

    }
    
}
