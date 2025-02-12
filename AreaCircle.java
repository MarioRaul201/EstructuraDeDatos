import java.util.Scanner;

public class AreaCircle {
    public static void areaCircle(double radius) {
        Scanner objScan = new Scanner(System.in);

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(String.format("The area of the circle is: " + area));

        objScan.close();
    }
}
