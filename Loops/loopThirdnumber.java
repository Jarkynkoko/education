package Loops;

public class loopThirdnumber {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 30; i++) {

            System.out.println(i);


            if (count == 2) {
                System.out.println("Quack.");
                count = 0;
            }
            count++;
        }
    }
}
