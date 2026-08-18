import java.util.ArrayList;
import java.util.Scanner;

public class MEDGuia3Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> descripciones = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();
        double total = 0;

        while (true) {
            System.out.print("Ingrese descripción de gasto (o 'fin' para terminar): ");
            String desc = sc.nextLine();
            if (desc.equalsIgnoreCase("fin"))
                break;

            System.out.print("Ingrese monto: ");
            double monto = sc.nextDouble();
            sc.nextLine();

            descripciones.add(desc);
            montos.add(monto);
            total += monto;
        }

        System.out.println("\nLista de gastos:");
        for (int i = 0; i < descripciones.size(); i++) {
            System.out.println(descripciones.get(i) + " - $" + montos.get(i));
        }
        System.out.println("Total gastado: $" + total);

        sc.close();
    }
}
