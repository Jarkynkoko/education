package String;

import java.util.Scanner;

public class compareTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings to compare: ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int compare = word1.compareTo(word2);

      if (compare < 0){
          System.out.println(word1);
      }else if (compare> 0){
          System.out.println(word2);
      }else {
          System.out.println("Equal");
      }

    }
}
