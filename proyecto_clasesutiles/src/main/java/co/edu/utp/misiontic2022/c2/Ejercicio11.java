package co.edu.utp.misiontic2022.c2;

/*
Programa que lea una variable entera mes y compruebe si el
valor corresponde a un mes de 30 días, de 31 o de 28.
Supondremos que febrero tiene 28 días. Se mostrará además el
nombre del mes. Se debe comprobar que el valor introducido esté
comprendido entre 1 y 12
*/

import java.util.Scanner;

public class Ejercicio11 {
    
    public static String comprobarMes(int mes){
        String compruebaMes = " ";

        if(mes == 4 || mes == 6 || mes == 9 | mes == 11){
            compruebaMes = "El valor ingresado corresponde a un mes de 30 días";
        }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            compruebaMes = "El valor ingresado corresponde a un mes de 31 días";
        }else if(mes == 2){
            compruebaMes = "El valor ingresado corresponde a un mes de 28 días";
        }

        return compruebaMes;
    }

    public static String mostrarMes(int mes){
        String muestraMes = " ";

        
        if(mes == 1){
            muestraMes = "El mes es Enero";
        }else if(mes == 2){
            muestraMes = "El mes es Febrero";
        }else if(mes == 3){
            muestraMes = "El mes es Marzo";
        }else if(mes == 4){
            muestraMes = "El mes es Abril";
        }else if(mes == 5){
            muestraMes = "El mes es Mayo";
        }else if(mes == 6){
            muestraMes = "El mes es Junio";
        }else if(mes == 7){
            muestraMes = "El mes es Julio";
        }else if(mes == 8){
            muestraMes = "El mes es Agosto";
        }else if(mes == 9){
            muestraMes = "El mes es Septiembre";
        }else if(mes == 10){
            muestraMes = "El mes es Octubre";
        }else if(mes == 11){
            muestraMes = "El mes es Noviembre";
        }else if(mes == 12){
            muestraMes = "El mes es Diciembre";
        }

        return muestraMes;
    }

    public static String comprobarLimite(int mes){
        String compruebaLimite = " ";

        if(mes == 0 || mes >= 13){
            compruebaLimite = "El valor introducido no es correcto. Ingrese un valor del 1 al 12";
        }

        return compruebaLimite;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor del mes en una escala del 1 al 12: ");
        int mes = sc.nextInt();

        String resultadoCompruebaMes = comprobarMes(mes);
        String resultadoMuestraMes = mostrarMes(mes);
        String resultadoCompruebaLimite = comprobarLimite(mes);

        System.out.println("\n\n" + resultadoCompruebaMes);
        System.out.println(resultadoMuestraMes);
        System.out.println(resultadoCompruebaLimite + "\n");

        sc.close();

    }
}
