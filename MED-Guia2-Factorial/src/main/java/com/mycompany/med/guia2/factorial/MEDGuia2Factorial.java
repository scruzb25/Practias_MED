/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.factorial;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia2Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero no negativo: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
        input.close();
    }
}
