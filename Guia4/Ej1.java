import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new ArithmeticException("No se puede calcular raíz cuadrada de números negativos.");
            }

            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de entrada: " + e.toString());
        } finally {
            sc.close();
        }
    }
}
