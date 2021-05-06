package Methods;

public class calculatorOperators {
    public static void main(String[] args) {
        System.out.println(calculatorMethods("-",6,2));
    }
    public static double calculatorMethods(String op,int num, int num2 ){
    switch (op){
        case "+":
            return num + num2;
        case "/":
            return num / num2;
        case "*":
            return num * num2;
        case "%":
            return num % num2;
        case "-":
            return num -num2;
        default:
            System.out.println("Invalid operator");
            return 0;
      }
   }
}
