package co.edu.utp.misiontic2022.c2;

/*
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar
*/

import java.util.Scanner;

public class Ejercicio8 {

    public static void juego(char jugador1, char jugador2, char jugador3) {
        String resultado;

        System.out.println();
     
        if(jugador1 == 'P' && jugador2 == 'T' && jugador3 == 'T'){
            resultado = "Gana el jugador 1";
            System.out.println(resultado);
        }else if(jugador1 == 'P' && jugador2 == 'L' && jugador3 == 'P'){
            resultado = "Gana el jugador 2";
            System.out.println(resultado);
        }else if(jugador1 == 'P' && jugador2 == 'P' && jugador3 == 'L'){
            resultado = "Gana el jugador 3";
            System.err.println(resultado);
        }else if(jugador1 == 'L' && jugador2 == 'P' && jugador3 == 'P'){
            resultado = "Gana el jugador 1";
            System.out.println(resultado);
        }else if(jugador1 == 'L' && jugador2 == 'T' && jugador3 == 'L'){
            resultado = "Gana el jugador 2";
            System.out.println(resultado);
        }else if(jugador1 == 'L' && jugador2 == 'L' && jugador3 == 'T'){
            resultado = "Gana el jugador 3";
            System.out.println(resultado);
        }else if(jugador1 == 'T' && jugador2 == 'L' && jugador3 == 'L'){
            resultado = "Gana el jugador 1";
            System.out.println(resultado);
        }else if(jugador1 == 'T' && jugador2 == 'P' && jugador3 == 'T'){
            resultado = "Gana el jugador 2";
            System.out.println(resultado);
        }else if(jugador1 == 'T' && jugador2 == 'T' && jugador3 == 'P'){
            resultado = "Gana el jugador 3";
            System.out.println(resultado);
        }else{
            resultado = "Empate";
            System.out.println(resultado);
        }

    }


    public static void consultar(int verificar) {
        String consultar;

        System.out.println();

        if (verificar == 0) {
            consultar = "Muchas gracias por participar";
            System.out.println(consultar);
        } else if (verificar == 1){
            consultar = "¡Comencemos de nuevo!";
            System.out.println(consultar);
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1. Inserte P para piedra, L para papel o T para tijera: ");
        char jugador1 = sc.next().charAt(0);

        System.out.println("Jugador 2. Inserte P para piedra, L para papel o T para tijera: ");
        char jugador2 = sc.next().charAt(0);

        System.out.println("Jugador 3. Inserte P para piedra, L para papel o T para tijera: ");
        char jugador3 = sc.next().charAt(0);

        juego(jugador1, jugador2, jugador3);

        System.out.println("\n" + "¿Desea volver a jugar? Marque 0 para NO y 1 para SI: ");
        int verificar = sc.nextInt();

        consultar(verificar);

        sc.close();
    }
}
