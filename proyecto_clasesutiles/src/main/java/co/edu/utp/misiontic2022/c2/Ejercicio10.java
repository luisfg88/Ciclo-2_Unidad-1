package co.edu.utp.misiontic2022.c2;

/*
Programa que lea tres números enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y
comprueba si la hora que indican es una hora válida
*/

import java.util.Scanner;

public class Ejercicio10 {

    public static String horaValida(int hora, int minutos, int segundos){
        String validar = " ";

        if(hora >= 0 && hora < 24 && minutos > 0 && minutos <= 59 && segundos > 0 && segundos <= 59){
            validar = "Es una hora válida";
        }else{
            validar = "No es una hora válida";
        }

        return validar;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite la hora: ");
        int hora = sc.nextInt();

        System.out.println("Por favor digite los minutos: ");
        int minutos = sc.nextInt();

        System.out.println("Por favor digite los segundos: ");
        int segundos = sc.nextInt();

        String validacion = horaValida(hora, minutos, segundos);
        System.out.println(hora + ":" + minutos + ":" + segundos + " --> " + validacion);

        sc.close();
    }
}
