/*
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 06-Feb-2025
 */

public class UserData {
    public static void fullName() {         //Metodo para obtener el nombre completo
        String[] firstName = new String[1];     //Creando un arreglo de 1 elemento para el nombre
        String[] lastName = new String[1];      //Creando un arreglo de 1 elemento para el apellido

        System.out.println("Ingresa tu nombre: ");
        firstName[0] = System.console().readLine();     //Obteniendo el nombre

        System.out.println("Ingresa tu apellido: ");
        lastName[0] = System.console().readLine();      //Obteniendo el apellido

        System.out.println("Tu nombre completo es: " + firstName[0] + " " + lastName[0]);  //Imprimiendo el nombre completo

    }
}
