import java.util.ArrayList;
import java.util.Scanner;

public class MEDGuia3Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        String producto;
        double precio;
        double total = 0;

        while (true) {
            System.out.print("Ingrese producto (o 'fin' para terminar): ");
            producto = sc.nextLine();
            if (producto.equalsIgnoreCase("fin"))
                break;

            System.out.print("Ingrese precio: ");
            precio = sc.nextDouble();
            sc.nextLine();

            productos.add(producto);
            precios.add(precio);
            total += precio;
        }

        System.out.println("\nLista de compras:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i) + " - $" + precios.get(i));
        }
        System.out.println("Total: $" + total);

        sc.close();
    }
}
