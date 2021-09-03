package co.edu.utp.misiontic2022.c2;

/*
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales
*/

import java.util.Scanner;

public class Ejercicio2 {
    
    public static String promedioNotas(String nombreAlumno, double nota1, double nota2, double nota3) {
        String comprobar;
        double promedio;
        double suma;

        suma = nota1 + nota2 + nota3;

        promedio = suma / 3;

        if (promedio < 3) {
            comprobar = "Reprobado"; 
        } else {
            comprobar = "Aprobado";
        }

        return comprobar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo del estudiante :");
        String nombreAlumno = sc.nextLine();

        System.out.println("Ingrese la nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Ingrese la nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Ingrese la nota 3: ");
        double nota3 = sc.nextDouble();

        String comprobarEstado = promedioNotas(nombreAlumno, nota1, nota2, nota3);
        System.out.println("\n" + "Nombre del estudiante: " + nombreAlumno + "\n" + "Promedio de notas: " + ((nota1 + nota2 + nota3)/3) + "\n" + "Estado: " + comprobarEstado + "\n");

        sc.close();
    }
}
