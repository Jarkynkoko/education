package Methods;

public class voidNoArgs {
    public static void main(String[] args) {
        hello();
        oddNumbers();

    }
    public static void hello(){
       for (int i = 0; i < 50; i++){
           System.out.println("hello " + i + 1 );
       }
    }
    public static void oddNumbers(){

       for (int i = 0; i < 100; i++){
           if (i %2 ==0){
               System.out.println(i);
           }
       }
    }
}
