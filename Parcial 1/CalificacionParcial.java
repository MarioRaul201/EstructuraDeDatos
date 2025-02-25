
import java.util.Scanner;

public class CalificacionParcial {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Ingresa la calificacion del examen parcial: ");
        double calificacionFinal = objScanner.nextDouble();

        System.out.println("Ingresa la calificacion de las tareas: ");
        double calificacionTareas = objScanner.nextDouble();

        objScanner.close();
        calificacionFinal = calificacionFinal*.70;
        calificacionTareas = calificacionTareas*.30;

        System.out.println("La calificacion final es: " + (calificacionFinal + calificacionTareas));

    }
}
