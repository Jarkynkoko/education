package SwichtStatments;

public class StringSwich {
    public static void main(String[] args) {

        String fruit = "banana";

        switch (fruit){
            case "oranges":
                System.out.println("Oranges are sweet");
                break;
            case "banana":
            case "apples":
                System.out.println("My favorite");
                break;
            default:
                System.out.println("No a fruit");
        }
    }
}
