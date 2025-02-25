public class CalculoConIVA {
    public static void main(String[] args) {
        double[] precio = {103.7,123.5,743.6};

        for (int i = 0; i < precio.length; i++) {
            double precioIVA = precio[i] * 1.16;
            System.out.println(("El precio con IVA del producto " + (i+1) + " es: " + precioIVA));
        }
    }
}
