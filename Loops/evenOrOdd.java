package Loops;

public class evenOrOdd {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++){
            if (i ==20 || i == 40){
               continue;
            }
            if (i % 2 ==1){
                System.out.println("Odd number here "+i);
            }else {
                System.out.println("Even number here " +i);
            }
        }
        int i = 9;
        float f = 33.4f;

        System.out.println("i=" +i +" "+ "f=" +f);


    }
}
