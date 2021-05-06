package Arrays;

import java.util.Arrays;

public class colorArrayLoop {
    public static void main(String[] args) {
        String [] colors = {"red", "orange", "green", "blue"};

        for (int i = 0; i < colors.length; i ++){

            String color = colors[i]; // convert to String
            System.out.println(color);

            if (colors[i].length() >= 4){
                System.out.println(color);
            }
        }
        
    }
}
