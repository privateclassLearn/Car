package carpackage;

public class CarProducer {
    static void carProducer() {
        // We will list the names of some car producers in an array
        String[] cars = {"BMW", "Mercedes", "Renault", "Tesla"};
        // for (int i = 0; i < cars.length; i++) {
        // below is the proposed enhanced for loop
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
