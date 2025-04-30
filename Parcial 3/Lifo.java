import java.util.Stack;

public class Lifo {
    public Stack<String> CrearPila() {
        Stack<String> pila = new Stack<>();

        return pila;
    }

    public void add(Stack<String> lista,String item){
        lista.push(item);
        System.out.println("Elemento agregado: " + item);

    }

    public void remove(Stack<String> lista){
        if (!lista.isEmpty()) {
            String item = lista.pop();
            System.out.println("Elemento removido: " + item);
        } else {
            System.out.println("La pila está vacía.");
        }
    }
    public void whatsNext(Stack<String> lista){
        if (lista.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            String item = lista.peek();
            System.out.println("Elemento en la cima: " + item);
        }
    }
}