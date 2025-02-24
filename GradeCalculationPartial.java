public class GradeCalculationPartial {
   public static void calcuateGrade(double a, double b) {
    double califExamen = a;
    double califTareas = b;

    califExamen = califExamen * .70;
    califTareas = califTareas * .30;

    double califFinal = califExamen + califTareas;  

    System.out.println("Calificación final: " + califFinal );

    }
}
