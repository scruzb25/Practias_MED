/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia1.ej2;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia1Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nota del parcial 1 (%20)");
        float parcial1 = sc.nextFloat();
        System.out.println("Ingrese nota del parcial 2 (%25)");
        float parcial2 = sc.nextFloat();
        System.out.println("Ingrese nota del parcial 3 (%40)");
        float parcial3 = sc.nextFloat();
        System.out.println("Ingrese nota de la tarea (%15)");
        float tarea = sc.nextFloat();
        
        float notaFinal = (float) ((parcial1*0.2)+(parcial2*0.25)+(parcial3*0.4)+(tarea*0.15));
                
        System.out.println("La nota final del ciclo es: "+ notaFinal);
    }
}
