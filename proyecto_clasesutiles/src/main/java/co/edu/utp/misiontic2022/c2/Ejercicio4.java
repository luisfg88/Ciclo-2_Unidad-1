package co.edu.utp.misiontic2022.c2;

//Programa que pase una velocidad en Km/h a m/s

import java.util.Scanner;

public class Ejercicio4 {
    
    public static double conversionVelocidad(double velocidad){
        double calculo = (velocidad * 1000) / 3600;
        return calculo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Por favor digite la velocidad en Km/h para convertir a m/s:");
        double velocidad = sc.nextDouble();
    
        double velocidadConvertida = conversionVelocidad(velocidad);
        System.out.println(velocidad + " Km/h es = " + velocidadConvertida + " m/s");
        sc.close();
    }

}

