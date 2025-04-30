import java.util.Queue;
import java.util.Stack;

public class Parcial3Main {
    public static void main(String[] args) {
        /*
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Search for 20: " + list.search(20));

        list.delete(20);
        System.out.println("List after deleting 20:");
        list.display();


        list.insert(18);
        System.out.println("List after inserting 18:");
        list.display();
    } 
    */

        //LIFO
        Lifo pila2 = new Lifo();
        Stack<String> pileishon = pila2.CrearPila();
        pila2.add(pileishon,"PLato 1");



        //FIFO
        Fifo cola2 = new Fifo();
        Queue<String> coleishon = cola2.CrearCola();
        cola2.add(coleishon, "Plato 1");
        }
}