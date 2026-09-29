import java.util.ArrayList;
import java.util.Scanner;

class Pila {
    private ArrayList<Integer> elementos;
    private int cima;

    public Pila(int capacidad) {
        elementos = new ArrayList<>(capacidad);
        cima = -1;
    }

    public void push(int elemento) {
        elementos.add(++cima, elemento);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(cima--);
    }

    public boolean isEmpty() {
        return cima == -1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(cima);
    }
}

public class PilaArrayList_Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del ArrayList: ");
        int capacidad = entrada.nextInt();
        Pila pila = new Pila(capacidad);

        System.out.println("Ingrese los elementos de la pila:");
        for (int i = 0; i < capacidad; i++) {
            int elemento = entrada.nextInt();
            pila.push(elemento);
        }

        System.out.println("Pila: ");
        while (!pila.isEmpty()) {
            int elemento = pila.pop();
            System.out.print(elemento + " ");
        }
        System.out.println("");
        entrada.close();
    }
}
