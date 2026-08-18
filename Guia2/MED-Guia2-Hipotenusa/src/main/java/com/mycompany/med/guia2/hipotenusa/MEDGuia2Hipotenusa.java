/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.hipotenusa;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia2Hipotenusa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double catetoA = input.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double catetoB = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        input.close();
    }
}
