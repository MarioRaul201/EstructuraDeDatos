

/*
 * Autor: Mario Villegas
 * Matricula: 14599
 * Fecha: 4/3/2025
 */

import java.util.Scanner;

public class Parcial2 {
    public static void main(String[] args) {
/*
        //int[] mejorcaso= {0,1,2,3,4,5,6,7,8,9};
        int[] peorcaso= {9,8,7,6,5,4,3,2,1,0};

        System.out.println("InsertionSort");
        InsertionSort insertSort = new InsertionSort();
        insertSort.sort(peorcaso);
        for (int num : peorcaso) {
            System.out.print(" "+num);
        }

        System.out.println("\nSelectionSort");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(peorcaso);
        for (int num : peorcaso) {
            System.out.print(" "+num);
        }

        System.out.println("\nBubbleSort");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(peorcaso);
        for (int num : peorcaso) {
            System.out.print(" "+num);
        }
*/
/*
        System.out.print("Ingrese numero a buscar: ");
        Secuencial secuencial = new Secuencial();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(secuencial.busqueda(num));
        sc.close();

*/


        Hashmap hashmap = new Hashmap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la clave: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el valor: ");
        int valores = sc.nextInt();
        hashmap.examplehash(name, valores);
        sc.close();

        }
}