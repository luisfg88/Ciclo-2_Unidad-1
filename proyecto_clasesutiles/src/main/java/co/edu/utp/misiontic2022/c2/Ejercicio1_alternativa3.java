package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1_alternativa3 {
    
    public static int numeroSuerte(String dia, String mes, String anio){
        int sumatoriaFecha = Integer.parseInt(dia) + Integer.parseInt(mes) + Integer.parseInt(anio);

        int cifra1 = sumatoriaFecha/1000;
        int cifra2 = sumatoriaFecha/100%10;
        int cifra3 = sumatoriaFecha/10%10;
        int cifra4 = sumatoriaFecha%10;

        int sumatoriaTotal = cifra1 + cifra2 + cifra3 + cifra4;

        return sumatoriaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su día de nacimiento: ");
        String dia = sc.nextLine();

        System.out.println("Ingrese su mes de nacimiento: ");
        String mes = sc.nextLine();

        System.out.println("Ingrese su año de nacimiento: ");
        String anio = sc.nextLine();

        int suerte = numeroSuerte(dia, mes, anio);
        System.out.println("\n" + dia + "/" + mes + "/" + anio + " --> " + " Su número de la suerte es " + suerte + "\n");

        sc.close();
    }
}
