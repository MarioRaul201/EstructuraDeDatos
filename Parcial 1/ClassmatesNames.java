

/*
 * Autor: Mario Villegas
 * Matrícula: 14599
 * Fecha: 04-Feb-2025
 */

public class ClassmatesNames {
    public static void showNames() {
        String[] names = new String[14];  //creando un arreglo de 14 elementos 
        names[0] = "Camila";
        names[1] = "Cristian";
        names[2] = "Sebastian";
        names[3] = "Mario";
        names[4] = "Avitia";
        names[5] = "Leslie";
        names[6] = "Argel";
        names[7] = "Beca";
        names[8] = "Rodrigo";
        names[9] = "Jorge";
        names[10] = "Oscar";
        names[11] = "Carlo";
        names[12] = "Cesar";
        names[13] = "Justin";

        System.out.println("Yo soy" + names[3]);


        //utilizando un for each para imprimir los nombres, recorriendo el arreglo

        for (String name : names) {
            System.out.println(name);
        }
        
        //print a la longitud del arreglo
    System.out.println(names.length);
        }
    }