package Methods;

import java.util.Arrays;

public class stringSmallestBiggestAdd {
    public static void main(String[] args) {
        System.out.println(addBiggestToSmallest("283874"));
    }
    public static int addBiggestToSmallest(String num){
        String [] numbers = num.split("");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        return Integer.parseInt(numbers[numbers.length-1]) - Integer.parseInt(numbers[0]);
    }
}
