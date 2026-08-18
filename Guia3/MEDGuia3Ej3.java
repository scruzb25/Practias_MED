import java.util.Scanner;

public class MEDGuia3Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];
        String[] cargos = new String[5];
        double[] sueldos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Empleado " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Cargo: ");
            cargos[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
        }

        System.out.println("\nInformación de empleados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + " - " + cargos[i] + " - $" + sueldos[i]);
        }

        sc.close();
    }
}
