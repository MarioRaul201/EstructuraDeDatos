
import java.util.Scanner;

/*
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 06-Feb-2025
 */

public class Estructura {
    public static void main(String[] args) {
        //ArrayNames.arrayNames();
        //PiedraPapelTijera.ppt();
        //ClassmatesNames.showNames();
        //Calificaciones.promedio();
        //UserData.fullName();
        //Scan.scanning();
        //TriangleScan.areaTriangle();
        Scanner objScan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = objScan.nextDouble();
        AreaCircle.areaCircle(radius);
        objScan.close();
    }
}