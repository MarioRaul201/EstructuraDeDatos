

public class SalesWithDiscount {
    public static void totalWithDiscount() {
        double [] sales = {100,200,150,300};
        double [] discount= new double[4];
        double result = 0.0;

        for (int i = 0; i < sales.length; i++) {
            discount[i] = sales[i]*0.9;
        }

        for (int j = 0; j < discount.length; j++) {
            result += discount[j];
        }

        System.out.println("La suma totqal de ventas con el 10% de descuento es: "+ result);
    }
}
