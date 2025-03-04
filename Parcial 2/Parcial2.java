/*
 * Autor: Mario Villegas
 * Matricula: 14599
 * Fecha: 4/3/2025
 */

public class Parcial2 {
    public static void main(String[] args) {

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

    }
}