import java.util.ArrayList;

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();
    public void arrayListCars(String car) {
        cars.add(car);
        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));

        
        System.out.println(cars.size());
        }
        
    }
}
