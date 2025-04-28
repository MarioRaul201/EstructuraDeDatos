import java.util.Stack;

public class Lifo {
    public void EjemploPila() {
        Stack<String> pila = new Stack<>();

        // PUSH: Agregando elementos
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");
        pila.push("Plato 4");

        // PEEK: Consultando el elemento en la cima
        System.out.println("Elemento en la cima: " + pila.peek());

        // POP: Eliminando elementos de la pila
        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elemento removido: " + pila.pop());

        System.out.println("Elemento removido: " + pila.pop());

        // PEEK: Estado final de la pila
        System.out.println("Elemento en la cima ahora: " + pila.peek());
    }
}