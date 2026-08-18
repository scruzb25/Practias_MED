/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.planocartesiano;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia2PlanoCartesiano {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la coordenada X: ");
        double x = input.nextDouble();

        System.out.print("Ingrese la coordenada Y: ");
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("El punto se encuentra en el ORIGEN.");
        } else if (x == 0) {
            System.out.println("El punto se encuentra sobre el EJE Y.");
        } else if (y == 0) {
            System.out.println("El punto se encuentra sobre el EJE X.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el CUADRANTE I.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el CUADRANTE II.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el CUADRANTE III.");
        } else {
            System.out.println("El punto se encuentra en el CUADRANTE IV.");
        }
        input.close();
    }

}
