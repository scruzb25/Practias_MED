import java.util.Scanner;

public class MEDGuia3Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];
        double[] precios = new double[n];
        int[] cantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Precio: ");
            precios[i] = sc.nextDouble();
            System.out.print("Cantidad: ");
            cantidades[i] = sc.nextInt();
            sc.nextLine();
        }

        double totalInventario = 0;
        System.out.println("\nInventario:");
        for (int i = 0; i < n; i++) {
            double valor = precios[i] * cantidades[i];
            totalInventario += valor;
            System.out.println(nombres[i] + " - $" + precios[i] + " x " + cantidades[i] + " = $" + valor);
        }
        System.out.println("Valor total del inventario: $" + totalInventario);

        sc.close();
    }
}
