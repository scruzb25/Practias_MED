/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.med.guia1.ej3;

/**
 *
 * @author salva
 */
import java.util.Scanner;
public class MEDGuia1Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la nota 1 (%55)");
        float nota1 = sc.nextFloat();
        System.out.println("Ingresa la nota 2 (%30)");
        float nota2 = sc.nextFloat();
        System.out.println("Ingresa la nota 3 (%15)");
        float nota3 = sc.nextFloat();
        
        double notaFinal = (double) (nota1*0.55)+(nota2*0.30)+(nota3*0.15);
        
        System.out.println("Tu nota final es: " + notaFinal);
    }
}
