package String;

public class not {
    public static void main(String[] args) {
        String word  = "Today is nice day";
        String word2= "Java";
        String word3 = "James";

        System.out.println(word2.compareTo(word3));


        boolean b = word.startsWith("Today");
        System.out.println(b);
        System.out.println("Not: " + !b);
        System.out.println(word.endsWith("day"));
        System.out.println(!word.endsWith("day"));
        System.out.println(!word.startsWith("day"));





    }
}
