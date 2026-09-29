import java.util.Stack;

public class StackClass_Ej1 {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(23);
        pila.push(89);
        System.out.println("Los valores de la pila ingresada: " + pila);
    }
}