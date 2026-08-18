import java.util.Scanner;

public class MEDGuia3Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de estudiantes: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0, max = notas[0], min = notas[0];
        for (double nota : notas) {
            suma += nota;
            if (nota > max)
                max = nota;
            if (nota < min)
                min = nota;
        }

        double promedio = suma / n;
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        sc.close();
    }
}
