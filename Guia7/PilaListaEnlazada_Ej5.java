import java.util.Scanner;

class NodoLista {
    public int valor;
    public NodoLista siguiente;

    public NodoLista(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class PilaLista {
    private NodoLista cima;

    public PilaLista() {
        this.cima = null;
    }

    public void push(int elemento) {
        NodoLista nuevoNodo = new NodoLista(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valorCima = cima.valor;
        cima = cima.siguiente;
        return valorCima;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.valor;
    }
}

public class PilaListaEnlazada_Ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la lista enlazada: ");
        int capacidad = entrada.nextInt();
        PilaLista pila = new PilaLista();

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
