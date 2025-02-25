public class MultidimensionalArrays {
    public static void matrices() {
        int[][] matrix = {
            {1,2},
            {3,4}
        };

        for (int i=0; i<matrix.length; i++) {
            System.out.println("longitud de la fila: " + matrix[i].length);
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
