package Arrays;

import java.util.Arrays;

public class addTwoArraysSimple {
    public static void main(String[] args) {

        int [] valOne = {3,2,6,43,7,20, 5, 4 };
        int [] valTwo = {2,7,-10,10,-5,2, 6, 4};

        int [] sum = new int[valOne.length];

        for (int i = 0; i < valOne.length; i++){
            sum[i] = valOne[i] + valTwo[i];
        }
        System.out.println(Arrays.toString(sum));


    }
}
