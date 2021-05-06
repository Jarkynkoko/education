package String;

import java.util.Scanner;

public class picnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* You have a String with the following value:
         -> “We will have a picnic when the weather gets nicer”
        First print the given sentence. Then the user is asked to enter the following: the set of characters from the sentence
        they want to change, and the set of characters that will show up in place of the ones which were removed. Print the new sentence.
                > input: “w” , “La”
          > output: “We Laill have a picnic Lahen the Laeather gets nicer”*/


        String sentence = "We will have a picnic when the weather gets nicer";
        System.out.println(sentence);

        System.out.println("What do you want to change: ");
        String  change = scanner.nextLine();

        System.out.println("What do you want to change that to: ");
        String replace = scanner.nextLine();

       String changeWord = sentence.replace(change,replace);
        System.out.println(changeWord);





    }
}
