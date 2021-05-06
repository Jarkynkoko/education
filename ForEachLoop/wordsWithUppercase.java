package ForEachLoop;

public class wordsWithUppercase {
    public static void main(String[] args) {

        String [] words = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;

        for (String word: words){
            char start = word.charAt(0);
            //if(Character.isUppercase(start)) -> method takes character
           if (start >= 65 && start <= 90){
            count ++;
               System.out.println(word);
           }
        }
        System.out.println( + count);

    }
}
