/*
 * Contamos cuantos números pares, impares y ceros hay en un arreglo de 50 elementos 
 * 
 * 
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 18-Feb-2025
 */

public class OddsPairsZero {
    public void countnumbers() {
        //Se declara el arreglo de numeros
        int[] numeros = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };
        //Declaramos las variables de conteo
        int pairs = 0;
        int odds = 0;
        int zeros = 0;

        //Recorremos el arreglo numeros
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] == 0) {
                zeros++; //Si el número es 0, incrementamos la variable zeros
            } else if (numeros[i] % 2 == 0) {
                pairs++; //Si el número es par, se incrementa la variable pairs
            } else {
                odds++; //Si el número es impar, se incrementa la variable odds
            }
        }

        //Print a las variables
        System.out.println("Total números pares: "+pairs);
        System.out.println("Total números impares: "+odds);
        System.out.println("Total ceros: "+zeros);
    }
}