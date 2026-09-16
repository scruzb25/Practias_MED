import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese su salario anual: ");
            String entrada = sc.nextLine();

            double salario = Double.parseDouble(entrada);
            double impuesto = 0;

            if (salario <= 5000) {
                impuesto = salario * 0.05;
            } else if (salario <= 20000) {
                impuesto = salario * 0.10;
            } else {
                impuesto = salario * 0.20;
            }

            System.out.println("Salario: $" + salario);
            System.out.println("Impuesto a pagar: $" + impuesto);

        } catch (NumberFormatException e) {
            System.out.println("Error: El salario ingresado no es un número válido.");
        } finally {
            sc.close();
        }
    }
}
