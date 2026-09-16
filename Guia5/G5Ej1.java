import java.util.Scanner;

public class G5Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos nombres desea ingresar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        for (int i = 1; i < n; i++) {
            String key = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(key) > 0) {
                nombres[j + 1] = nombres[j];
                j = j - 1;
            }
            nombres[j + 1] = key;
        }

        System.out.println("\nLista ordenada alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        sc.close();
    }
}
