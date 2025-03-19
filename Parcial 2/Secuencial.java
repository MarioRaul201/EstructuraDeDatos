public class Secuencial {
    public int busqueda(int num) {
        int[] array= {10,9,8,7,6,5,4,3,2,1};
        int ubicado = 0;


        for (int i = 0; i <array.length; i++) {
            if (num == array[i]) {
                ubicado = i;
                break;
            } else {
                ubicado = -1;
            } 
        }
        return ubicado;
    }
}
