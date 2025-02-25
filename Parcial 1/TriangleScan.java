
import java.util.Scanner;

public class TriangleScan {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void areaTriangle() {
        Scanner objscan = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = objscan.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = objscan.nextDouble();

        double area = (base * height) / 2;

        System.out.println(String.format("The area of the triangle is: " + area));

        objscan.close();
    }
}
