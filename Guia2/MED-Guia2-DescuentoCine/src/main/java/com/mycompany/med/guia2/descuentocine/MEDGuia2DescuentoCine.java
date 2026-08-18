/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.descuentocine;

/**
 *
 * @author salva
 */
import java.util.Scanner;

public class MEDGuia2DescuentoCine {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = input.nextInt();

        System.out.print("Ingrese el precio base del boleto ($): ");
        double precioBoleto = input.nextDouble();

        double pagoFinal;

        if (edad < 18 || edad > 60) {
            pagoFinal = precioBoleto * 0.50; // 50% de descuento
            System.out.println("Aplica descuento del 50%.");
        } else {
            pagoFinal = precioBoleto;
            System.out.println("No aplica descuento.");
        }

        System.out.println("El monto a pagar por la entrada es: $" + String.format("%.2f", pagoFinal));

        input.close();
    }

}
