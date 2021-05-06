package ForEachLoop;

public class StringCities {
    public static void main(String[] args) {
        String [] cities = { "chicago","New York", "Madison", "CHİCAGO","Miami","Chicago", "Washington"};

        boolean check = false;
        int count = 0;

        for (String city:cities){

            if (city.equalsIgnoreCase("Chicago")){
            check = true;
            count ++;
            }
        }
        if (check){
            System.out.println("Windy city found " + count + " times");
        }else {
            System.out.println("Windy city not found");
        }
}
}
