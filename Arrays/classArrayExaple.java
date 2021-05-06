package Arrays;

public class classArrayExaple {
    public static void main(String[] args) {


       /*for (int i = 0; i < 5; i ++){
            System.out.println("i is: " + i);


           for (int j = 0; j < 5; j++){
               System.out.println("j is: " + j );

           }

           System.out.println();
        }*/


      for (int i = 0; i < 5; i++){
            System.out.println("outer is: " + i);

            for (int j = 0; j <= i; j++){
                System.out.println("inner is: " + j);
            }
          System.out.println();

        }



    }
}
