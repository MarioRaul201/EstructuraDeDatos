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

/* 
        Scanner objScan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = objScan.nextDouble();
        AreaCircle.areaCircle(radius);
        objScan.close();
*/
/*
        ArrayListExample objArrayListExample = new ArrayListExample();
        objArrayListExample.arrayListCars("Toyota");

        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter the car you want to add: ");
        String car = objScanner.nextLine();
        objArrayListExample.arrayListCars(car);

        objScanner.close();
*/

        //MultidimensionalArrays.matrices();

        Grades student = new Grades();
                //Calcualar calificación parcial
        int partialGrade=student.calculatePartialGrade(85,90);
        System.out.println("Partial grade: "+partialGrade);
                //Calcular la calificacion final
        int finalGrade=student.calculateFinalGrade(80,75,90,85);
        System.out.println("Final grade: "+finalGrade);
                //Verificar si el alumno reprobo por faltas
        String attendanceStatus=student.checkFailureByAbsences(64,7);
        System.out.println(attendanceStatus);


        


    }
}