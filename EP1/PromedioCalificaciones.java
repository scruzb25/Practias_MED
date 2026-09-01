import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumaNotas = 0;
        int cantidad = 0;

        System.out.println("Ingrese calificaciones (0 a 10). ");
        System.out.println("Ingrese un número negativo para salir.");

        while (true) {
            try {
                System.out.print("Calificación: ");
                double nota = sc.nextDouble();

                if (nota < 0 || nota > 10) {
                    break;
                } else {
                    sumaNotas += nota;
                    cantidad++;
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
                sc.nextLine();
            }
        }

        double promedio = (cantidad > 0) ? sumaNotas / cantidad : 0;
        System.out.println("Promedio final: " + promedio);
        sc.close();
    }
}