import java.util.LinkedList;
import java.util.Queue;

public class Fifo {
    public Queue<String> CrearCola() {
        Queue<String> cola = new LinkedList<>();
        return cola;
    }
    public void add(Queue<String> lista,String item){
        lista.add(item);
        System.out.println("Elemento agregado: " + item);
    }
    public void remove(Queue<String> lista){
        if (!lista.isEmpty()) {
            String item = lista.poll();
            System.out.println("Elemento removido: " + item);
        } else {
            System.out.println("La cola está vacía.");
        }
    }
    public void whatsNext(Queue<String> lista){
        if (lista.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            String item = lista.peek();
            System.out.println("Elemento al frente: " + item);
        }
    }
}

