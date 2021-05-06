package String;

public class LastIndex {
    public static void main(String[] args) {
        String word = "jaaavaa";
        String word2 = "it is fun";
        int num = word.lastIndexOf("a",2);
        System.out.println(num);
        System.out.println(word.toUpperCase());
        System.out.println(word);// it is only String monipulation
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("a", "o"));
        System.out.println(word.replace("a","11"));
        System.out.println(word.charAt(0));
        System.out.println(word.toUpperCase().replace("a","23"));


        System.out.println(word2.substring(2,5));
        System.out.println(word2.substring(2));
        System.out.println(word2.substring(0,1));



    }
}
