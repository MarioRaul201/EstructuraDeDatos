//Big O notation of Selection Sort is O(n^2) in the worse case
//O(n^2) = (n(n-1))/2

public class SelectionSort {
    int comparaciones = 0;
    public void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                comparaciones++; //contador de comparaciones
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Comparaciones:" + comparaciones);
    }
}