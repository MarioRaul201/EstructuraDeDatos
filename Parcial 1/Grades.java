/*
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 11-Feb-2025
 */

 //calcular la calificación parcial, final y verificar si el alumno reprobo por faltas
public class Grades {
    //Calcular calificación parcial
    public int calculatePartialGrade(int examScore,int homeworkScore) {
        int partialGrade = (int) ((examScore * 0.7) + (homeworkScore * 0.3));
        return partialGrade;
    }
    //Verificar si el alumno reprobo por faltas
    public String checkFailureByAbsences(int totalHours, int absenses){
        if (absenses > (totalHours*.1)){
            return "Reprobado por Faltas";
        } else {
            return "Cumple con asistencias minimas";
        }
        }
    //Calcular la calificacion final
    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        int finalGrade = (int) (((firstPartial + secondPartial + thirdPartial)/3)*.5 + (finalExam * 0.5));
        return finalGrade;
    }
    }