import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre de usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Ingrese contraseña: ");
            String contrasena = sc.nextLine();

            if (contrasena.length() < 6 || !contrasena.matches(".*[!@#$%^&*].*")) {
                throw new SecurityException("La contraseña debe tener al menos 6 caracteres y un carácter especial.");
            }

            System.out.println("Usuario registrado exitosamente.");
            System.out.println("Usuario: " + usuario);

        } catch (SecurityException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
