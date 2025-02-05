/*
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 05-Feb-2025
 */
// Sumar 3 califiaciones e imprimir el promedio.

public class Calificaciones {
    public static void promedio() {
        double[] calificaciones = {100,98,76};
        double suma = 0;


        for(double calificacion : calificaciones){  //recorriendo el arreglo y sumando las calificaciones
            System.out.println(calificacion);
            suma += calificacion;
        }

        System.out.println((suma/calificaciones.length)); //imprimiendo el promedio
    }

}
