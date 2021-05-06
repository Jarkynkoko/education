package String;

import java.util.Locale;

public class carGarage2 {
    public static void main(String[] args) {
        String cars = "Toyota, Jaguar, BMW";
        cars = cars.toLowerCase();

        if (cars.isEmpty()){
            System.out.println("Garage is empty");
        }
        if (cars.contains("bmw")){
            System.out.println("There is German car in your garage");
        }
        if (cars.contains("jaguar")){
            System.out.println("There is British car in your garage");
        }
        if (cars.contains("toyota") ||cars.contains("nissan")){
            System.out.println("There is Japanese car in your garage");
        }else {

        }
    }
}
