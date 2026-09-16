import java.util.Scanner;

class Nodo {
    String tarea;
    Nodo siguiente;

    public Nodo(String tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarTarea(String tarea) {
        Nodo nuevaTarea = new Nodo(tarea);
        nuevaTarea.siguiente = cabeza;
        cabeza = nuevaTarea;
        System.out.println("Nueva tarea agregada al principio de la lista.");
    }

    public void eliminarTarea(String tarea) {
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }
        if (cabeza.tarea.equals(tarea)) {
            cabeza = cabeza.siguiente;
            System.out.println("Tarea eliminada: " + tarea);
            return;
        }
        Nodo anterior = null;
        Nodo actual = cabeza;
        while (actual != null && !actual.tarea.equals(tarea)) {
            anterior = actual;
            actual = actual.siguiente;
        }
        if (actual == null) {
            System.out.println("La tarea especificada no se encuentra en la lista.");
        } else {
            anterior.siguiente = actual.siguiente;
            System.out.println("Tarea eliminada: " + tarea);
        }
    }

    public void mostrarTareas() {
        if (cabeza == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }
        Nodo actual = cabeza;
        System.out.println("Lista de tareas:");
        while (actual != null) {
            System.out.println("- " + actual.tarea);
            actual = actual.siguiente;
        }
    }
}

public class EjercicioEvaluado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Bienvenido a la aplicación de gestión de tareas.");

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Ver lista de tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la nueva tarea: ");
                    String nuevaTarea = sc.nextLine();
                    lista.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                    String tareaEliminar = sc.nextLine();
                    lista.eliminarTarea(tareaEliminar);
                    break;
                case 3:
                    lista.mostrarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
