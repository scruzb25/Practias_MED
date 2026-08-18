/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.descuentorenta;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia2DescuentoRenta {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el sueldo mensual del empleado ($): ");
        double sueldoBruto = input.nextDouble();

        double retencionRenta = 0.0;

        // Descuentos de renta en El Salvador
        if (sueldoBruto > 0 && sueldoBruto <= 472.00) {
            retencionRenta = 0.0; // Tramo I: Exento
        } else if (sueldoBruto > 472.00 && sueldoBruto <= 895.24) {
            retencionRenta = (sueldoBruto - 472.00) * 0.10 + 17.67;
        } else if (sueldoBruto > 895.24 && sueldoBruto <= 2038.10) {
            retencionRenta = (sueldoBruto - 895.24) * 0.20 + 60.00; 
        } else if (sueldoBruto > 2038.10) {
            retencionRenta = (sueldoBruto - 2038.10) * 0.30 + 288.57;
        }

        double sueldoNeto = sueldoBruto - retencionRenta;

        System.out.println("------------------------------------------");
        System.out.println("Sueldo Bruto: $" + sueldoBruto);
        System.out.println("Descuento de Renta: $" + String.format("%.2f", retencionRenta));
        System.out.println("Sueldo Neto a Recibir: $" + String.format("%.2f", sueldoNeto));
        System.out.println("------------------------------------------");

        input.close();
    }

}
