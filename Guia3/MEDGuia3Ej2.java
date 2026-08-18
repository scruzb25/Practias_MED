public class MEDGuia3Ej2 {
    public static void main(String[] args) {
        int[] numeros = { 1, 5, 8, 9, 2, 3, 1 };

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Orden Ascendente ");
        for (int n : numeros) {
            System.out.print(n + ", ");
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Orden Descendente ");
        for (int n : numeros) {
            System.out.print(n + ", ");
        }
    }
}
