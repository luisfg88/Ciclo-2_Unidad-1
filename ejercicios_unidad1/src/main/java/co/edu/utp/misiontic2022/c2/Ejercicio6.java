package co.edu.utp.misiontic2022.c2;

/*
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
*/

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void pesoIdeal(char sexo, double altura) {
    
        double pesoIdealMujeres;
        double pesoIdealHombres;

        System.out.println();

        if (sexo == 'F') {
            pesoIdealMujeres = (altura * 100) - 120;
            System.out.println("Peso ideal mujeres = " + pesoIdealMujeres + " Kg");
        }else if(sexo == 'M'){
            pesoIdealHombres = (altura * 100) - 110;
            System.out.println("Peso ideal hombres = " + pesoIdealHombres + " Kg");
        }

        System.out.println();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite su sexo. F para femenino o M para masculino: ");
        char sexo = sc.findInLine(".").charAt(0);

        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();

        pesoIdeal(sexo, altura);

        sc.close();
    }
}
