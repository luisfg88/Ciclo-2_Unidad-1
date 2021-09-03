package co.edu.utp.misiontic2022.c2;

/*
Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static double precioVentaProducto(double precioUnidad, Integer cantidadProductoVendido){
        double productoIva = precioUnidad * 0.19;
        double precioProductoIva = precioUnidad + productoIva;
        double precioTotal = precioProductoIva * cantidadProductoVendido;
        return precioTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el precio de la unidad del producto: ");
        double precioUnidad = sc.nextDouble();

        System.out.println("Digite la cantidad de producto vendido: ");
        Integer cantidadProductoVendido = sc.nextInt();

        double precioFinal = precioVentaProducto(precioUnidad, cantidadProductoVendido);
        System.out.println("El valor del producto es $" + precioFinal);
        sc.close();

    }
    
}
