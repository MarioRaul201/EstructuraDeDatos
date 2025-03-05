
//Big O notation of Insertion is O(n^2) in the worse case
//O(n^2) = (n(n-1))/2

public class InsertionSort {

    public void sort(int[] array) {
        int comparaciones = 0;
        for (int i = 0; i < array.length; i++) {
            int key =array[i];
            int j=i-1;

            while(j>=0 && array[j] >key){
                array[j+1] = array[j];
                j--;
                comparaciones++; //contador de comparaciones
            }
            array[j +1]=key;
        }
        System.out.println("Comparaciones:"+comparaciones);
    }
}