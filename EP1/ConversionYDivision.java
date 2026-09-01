/*
¿Qué tipos de excepciones pueden ocurrir en este código? 
    R/ Los tipos de excepciones que pueden ocurrir son NumberFormatException, ArrayIndexOutOfBoundsException y ArithmeticException.
    al intentar convertir un String a un Integer, se lanza NumberFormatException.
    al intentar dividir por cero, se lanza ArithmeticException.
    y ArrayIndexOutOfBoundsException si el usuario ingresa un índice fuera de 0-3.

¿Cómo podrías mejorar el manejo de errores? 
    R/ Se puede validar el indice antes de acceder al elemento, para evitar que se lance una excepción, o en su defecto
    se puede capturar la excepción y mostrar un mensaje de error, manteniendo el programa estable aunque ocurran errores.
*/

import java.util.Scanner;

public class ConversionYDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valores = { "20", "cuarenta", "60", "0" };

        System.out.print("Ingrese un índice del 0 al 3: ");
        int indice = sc.nextInt();

        try {
            int numero = Integer.parseInt(valores[indice]);
            int resultado = 100 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido");
        } catch (ArithmeticException e) {
            System.out.println("Error: dividir por cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        } catch (Exception e) {
            System.out.println("Error en la operación.");
        }
        sc.close();
    }
}