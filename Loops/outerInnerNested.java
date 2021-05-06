package Loops;

public class outerInnerNested {
    public static void main(String[] args) {

        outer: for (int i = 0; i < 5; i++){
            System.out.println("outer is: "+i);
           inner:  for (int j =0; j < 5; j++){
               System.out.println("inner is: "+j);

               if (j==2){
                   break inner;//outer, or just break;
               }

            }
            System.out.println();
        }
    }
}
