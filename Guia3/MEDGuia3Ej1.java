import java.util.Scanner;

public class MEDGuia3Ej1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = 0;
        int maximo = 0;
        int maxiPosition = 0;
        int minPosition = 0;

        System.out.println("Ingrese 5 numeros");
        while (i <= 4) {
            System.out.println("Posición del arreglo " + (i));
            numeros[i] = s.nextInt();
            i++;
        }

        int minimo = numeros[0];

        for (int j = 0; numeros.length > j; j++) {
            if (numeros[j] > maximo) {
                maximo = numeros[j];
                maxiPosition = j;
            }
            if (numeros[j] < minimo) {
                minimo = numeros[j];
                minPosition = j;
            }
        }

        System.out.println("El numero maximo es " + maximo + " en la posicion " +
                maxiPosition);
        System.out.println("El numero minimo es " + minimo + " en la posicion " +
                minPosition);

        s.close();
    }
}