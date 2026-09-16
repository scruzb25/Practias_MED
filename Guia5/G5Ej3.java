public class G5Ej3 {
    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };

        int maximo = arreglo[0];
        int minimo = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        System.out.println("Elemento máximo: " + maximo);
        System.out.println("Elemento mínimo: " + minimo);
    }
}
