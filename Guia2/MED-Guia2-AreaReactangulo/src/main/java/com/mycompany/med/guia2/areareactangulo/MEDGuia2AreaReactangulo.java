/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia2.areareactangulo;

/**
 *
 * @author salva
 */

import java.util.Scanner;
public class MEDGuia2AreaReactangulo {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();

        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);

        input.close();
    }

}
