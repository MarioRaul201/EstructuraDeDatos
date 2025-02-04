//Realiza print de cada uno de los nombres de los compañeros de clase. 

/**
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 04-Feb-2025
 */

public class ClassmatesNames {
    public static void showNames() {
        String[] array = new String[14];  //creando un arreglo de 14 elementos 
        array[0] = "Camila";
        array[1] = "Cristian";
        array[2] = "Sebastian";
        array[3] = "Mario";
        array[4] = "Avitia";
        array[5] = "Leslie";
        array[6] = "Argel";
        array[7] = "Beca";
        array[8] = "Rodrigo";
        array[9] = "Jorge";
        array[10] = "Oscar";
        array[11] = "Carlo";
        array[12] = "Cesar";
        array[13] = "Justin";

        System.out.println("Yo soy" + array[3]);


        //utilizando un for each para imprimir los nombres, recorriendo el arreglo

        for (String array1 : array) {
            System.out.println(array1);
        }
        
        //print a la longitud del arreglo
    System.out.println(array.length);
        }
    }