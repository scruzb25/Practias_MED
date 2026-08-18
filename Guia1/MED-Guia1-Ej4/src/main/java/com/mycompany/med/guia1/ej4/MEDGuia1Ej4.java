/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia1.ej4;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia1Ej4 {
    static final double iva = 0.13;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
         String nombreProducto = sc.next();
        System.out.println("Ingrese el precio del producto:");
         float precioProducto = sc.nextFloat();
        
        double calculoIva = precioProducto * iva;
        
        System.out.println("El producto es: "+ nombreProducto + " precio: $"+precioProducto+" IVA: $"+calculoIva+" Total:$"+(calculoIva+precioProducto));
    }
}
