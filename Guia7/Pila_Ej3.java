import java.util.Scanner;

class Pila {
    private int elementos[];
    private int cima;

    public Pila(int capacidad) {
        elementos = new int[capacidad];
        cima = -1;
    }

    public void push(int elemento) {
        elementos[++cima] = elemento;
    }

    public int pop() {
        return elementos[cima--];
    }

    public boolean isEmpty() {
        return cima == -1;
    }

    public int peek() {
        return elementos[cima];
    }
}

public class Pila_Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
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
