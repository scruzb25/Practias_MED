import java.util.ArrayList;

public class ListaUtiles {

    public static void main(String[] args) {
        // Lista inicial con error
        ArrayList<String> utiles = new ArrayList<>();
        utiles.add("Cuaderno");
        utiles.add("Lápiz");
        utiles.add("Borrador");
        utiles.add("Regla");
        utiles.add("Colores");
        utiles.add("Tijeras");
        utiles.add("Folders");
        utiles.add("Pegamento");
        utiles.add("Mochila"); // Error: debería ser "Sacapuntas"
        // TODO: Encontrar y corregir el error en la lista
        int indiceError = utiles.indexOf("Mochila");
        if (indiceError != -1) {
            utiles.set(indiceError, "Sacapuntas");// Añadir el código que falta
        }
        // TODO: Agregar un nuevo útil
        utiles.add("Plumolnes");
        // TODO: Eliminar un útil innecesario
        utiles.remove("Folders");

        // Mostrar la lista final corregida
        System.out.println("Lista de útiles corregida:");
        for (String item : utiles) {
            System.out.println("- " + item);
        }
    }
}