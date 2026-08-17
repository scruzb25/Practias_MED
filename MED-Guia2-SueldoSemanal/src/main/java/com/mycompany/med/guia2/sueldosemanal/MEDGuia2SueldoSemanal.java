/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.sueldosemanal;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia2SueldoSemanal {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String empleado = input.nextLine();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horas = input.nextDouble();

        System.out.print("Ingrese la clase de puesto (A, B, C o D): ");
        char clase = input.next().toUpperCase().charAt(0);

        double tarifaHora = 0.0;
        boolean claseValida = true;

        switch (clase) {
            case 'A':
                tarifaHora = 7.00;
                break;
            case 'B':
                tarifaHora = 8.50;
                break;
            case 'C':
                tarifaHora = 10.00;
                break;
            case 'D':
                tarifaHora = 12.50;
                break;
            default:
                claseValida = false;
                System.out.println("Clase de puesto no válida.");
        }

        if (claseValida) {
            double sueldoSemanal = horas * tarifaHora;
            System.out.println("\n--- COMPROBANTE DE PAGO ---");
            System.out.println("Empleado: " + empleado);
            System.out.println("Clase de Puesto: " + clase + " ($" + tarifaHora + "/hora)");
            System.out.println("Horas Trabadas: " + horas);
            System.out.println("Sueldo Semanal: $" + String.format("%.2f", sueldoSemanal));
        }
        input.close();
    }

}
