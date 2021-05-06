package UdemyJava;

public class exercise3array {
    public static void main(String[] args) {
        double [] nums = {20.5, 40.5, 50.5};
        double sumOfNums = 0;
        double mean = 0;

        for (int i = 0; i < nums.length; i ++){
            sumOfNums += nums[i];
            mean = sumOfNums/nums.length;



        }
        System.out.println(sumOfNums);
        System.out.println(mean);



    }
}
