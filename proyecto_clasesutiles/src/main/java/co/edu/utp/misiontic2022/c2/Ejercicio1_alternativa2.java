package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1_alternativa2 {
    
    public static int numeroSuerte(String fechaNacimiento){
        String cadena =fechaNacimiento.replace("/", "");

        int dia = (Integer.parseInt(cadena))/1000000;
        int mes = ((Integer.parseInt(cadena))/10000)%100;
        int anio =((Integer.parseInt(cadena)))%10000;

        int sumatoriaParcial = dia + mes + anio;
        
        int cifra1 = sumatoriaParcial/1000;
        int cifra2 = sumatoriaParcial/100%10;
        int cifra3 = sumatoriaParcial/10%10;
        int cifra4 = sumatoriaParcial%10;

        int sumatoriaTotal = cifra1 + cifra2 + cifra3 + cifra4;

        return sumatoriaTotal;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento DD/MM/AAAA: ");
        String fechaNacimiento = sc.nextLine();

        int suerte = numeroSuerte(fechaNacimiento);
        System.out.println("\n" + "Su número de la suerte es " + suerte + "\n");
        
        sc.close();
    }
}
