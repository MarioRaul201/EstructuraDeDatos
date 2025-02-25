

public class BidimentionalArray {
    public static void main(String[] args) {
        double[][] arrayTest = {{143.9,113.3},{183.5,543.6}};
        double result = 0;

        for (int i = 0; i < arrayTest.length; i++) {
            for (int j = 0; j < arrayTest[i].length; j++) {
                result += arrayTest[i][j];
            }
        }
        System.out.println("La sumatoria de los elementos es: " + result);
    }
}
