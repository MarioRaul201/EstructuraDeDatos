public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones
        
        for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
        comparisons++; // Contar comparaciones
        if (arr[j] > arr[j + 1]) {
        // Intercambio
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        }
        }
        }
        System.out.println("Comparaciones: "+comparisons);
    }
}