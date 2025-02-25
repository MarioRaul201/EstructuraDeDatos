
public class InsertionSort {

    int[] array={6,2,5,7,8,2};

    public void sort(){
        int lenght = array.length;
        for (int i = 0; i < array.length; i++) {
            int key =array[i];
            int j=i-1;

            while(j>=0 && array[j] >key){
                array[j+1] = array[j];
                j--;
            }
            array[j +1]=key;
        }
    }
}