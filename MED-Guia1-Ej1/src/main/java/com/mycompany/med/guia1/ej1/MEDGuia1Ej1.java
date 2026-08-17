/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia1.ej1;

/**
 *
 * @author salva
 */
import java.util.Scanner;

public class MEDGuia1Ej1 {
    static final double pi = 3.1416;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia");
        
        float radio = sc.nextFloat();
        
        float diametro = radio * 2;
        double area = (double) (pi * (radio * radio));
        
        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El diametro de la circunferencia es: " + diametro);
    }
}
