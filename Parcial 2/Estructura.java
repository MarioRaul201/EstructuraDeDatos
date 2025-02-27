public class Estructura {
    public static void main(String[] args) {
        SelectionSort selSort = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        SelectionSort.selectionSort(arr);
        for (int num : arr) {
            System.out.println(num);
        }

    }
}
