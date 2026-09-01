/*
¿Qué problema tiene este código? 
R/ Al intentar acceder a un elemento que no existe, se lanza una excepción.

¿Cómo se puede mejorar el manejo de exce
R/ Se puede validar el indice antes de acceder al elemento, para evitar que se lance una excepción

¿Qué excepción específica se genera y cómo capturarla?
R/ La excepción qeu se genera es: Error: Index 5 out of bounds for length 3
Se puede capturar con: ArrayIndexOutOfBoundsException
*/

public class AccesoArreglo {
    public static void main(String[] args) {
        try {
            int resultado = obtenerElemento(new int[] { 5, 10, 15 }, 5);
            System.out.println("Elemento: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int obtenerElemento(int[] datos, int indice) {
        return datos[indice];
    }
}