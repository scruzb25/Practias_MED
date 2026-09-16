import java.util.Scanner;

public class G5Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] diccionario = { "amor", "casa", "computadora", "java", "ordenamiento", "programa" };

        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = sc.nextLine();

        boolean encontrada = false;
        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i].equalsIgnoreCase(palabra)) {
                System.out.println("La palabra '" + palabra + "' fue encontrada en la posición " + i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("La palabra '" + palabra + "' no está en el diccionario.");
        }

        sc.close();
    }
}
