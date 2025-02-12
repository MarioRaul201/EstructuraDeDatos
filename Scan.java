
import java.util.Scanner;

public class Scan {
    public static void scanning() {
        Scanner objscanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = objscanner.nextLine();

        System.out.println("Enter your age: ");
        int age = objscanner.nextInt();

        System.out.println(String.format("Hi " + name +"! You are "+ age +" years old."));
        objscanner.close();
    }
}
