package String;

public class equelsEx {
    public static void main(String[] args) {

        String word = "Cybertek";
        String word2 = "Cybertek";

        System.out.println(word.equals(word2));
        int len = word.length();
        System.out.println(word.length() == word2.length());
        System.out.println(word.isEmpty());// word leght () == 0;
        System.out.println(word2.isEmpty());


    }
}
