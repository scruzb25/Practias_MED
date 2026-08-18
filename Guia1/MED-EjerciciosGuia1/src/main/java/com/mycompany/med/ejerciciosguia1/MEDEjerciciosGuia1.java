/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.med.ejerciciosguia1;

/**
 *
 * @author salva
 */
import java.util.Scanner;
import java.math.BigDecimal;

public class MEDEjerciciosGuia1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio:");
        System.out.println("1. Convertir dólares a euros");
        System.out.println("2. Volumen de un cubo");
        System.out.println("3. Nota media de tres exámenes");
        System.out.println("4. Intercambiar dos variables");
        System.out.println("5. Calcular segundos desde 0:0:0");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese cantidad en dólares: ");
                int dolares = sc.nextInt();
                double euros = dolares / 1.14;
                System.out.printf("Equivalente en euros: %.2f%n", euros);
                break;

            case 2:
                System.out.print("Ingrese la arista del cubo: ");
                double arista = sc.nextDouble();
                double volumen = Math.pow(arista, 3);
                System.out.printf("Volumen del cubo: %.2f%n", volumen);
                break;

            case 3:
                System.out.print("Ingrese nota examen 1: ");
                double n1 = sc.nextDouble();
                System.out.print("Ingrese nota examen 2: ");
                double n2 = sc.nextDouble();
                System.out.print("Ingrese nota examen 3: ");
                double n3 = sc.nextDouble();
                double media = (n1 + n2 + n3) / 3;
                System.out.printf("Nota media: %.2f%n", media);
                break;

            case 4:
                System.out.print("Ingrese v1: ");
                int v1 = sc.nextInt();
                System.out.print("Ingrese v2: ");
                int v2 = sc.nextInt();
                int temp = v1;
                v1 = v2;
                v2 = temp;
                System.out.println("Después del intercambio:");
                System.out.println("v1 = " + v1 + ", v2 = " + v2);
                break;

            case 5:
                System.out.print("Ingrese horas: ");
                int h = sc.nextInt();
                System.out.print("Ingrese minutos: ");
                int m = sc.nextInt();
                System.out.print("Ingrese segundos: ");
                int s = sc.nextInt();
                int totalSegundos = h * 3600 + m * 60 + s;
                System.out.println("Segundos transcurridos: " + totalSegundos);
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}
