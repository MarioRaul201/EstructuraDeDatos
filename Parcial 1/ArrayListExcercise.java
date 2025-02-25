import java.util.ArrayList;

public class ArrayListExcercise {
    public static void main(String[] args) {
        ArrayList <String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C");
        lenguajes.add("C#");
        lenguajes.add("kotlin");

        lenguajes.remove( 4);

        lenguajes.set(0, "Java (actualmente)");

        System.out.println(lenguajes.size());

        lenguajes.removeAll(lenguajes);
        System.out.println(lenguajes.size());
    }
}
