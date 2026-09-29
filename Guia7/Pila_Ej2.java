import java.util.Stack;
import java.util.Scanner;

public class Pila_Ej2 {
    public static void main(String[] args) throws Exception {

        Stack<Integer> pila = new Stack<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores que desea agregar a la pila (ingrese 0 para detener):");
        int valor = entrada.nextInt();
        while (valor != 0) {
            pila.push(valor);
            valor = entrada.nextInt();
        }
        System.out.println("Pila con Stack: " + pila);
        entrada.close();
    }
}