package String;

public class compare {
    public static void main(String[] args) {
        String word = "5java";
        String word2 = "James";
        String word3 = "5Java";
        String word4 = "James";
        System.out.println(word2.compareTo(word4));
        System.out.println(word.compareTo(word2));
        System.out.println(word2.compareTo(word));
        System.out.println(word.compareTo(word3));
        System.out.println(("java").compareTo("javaa"));
        System.out.println((".java").compareTo("java"));


    }
}
