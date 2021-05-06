package Arrays;

import java.util.Arrays;

public class biggestWordsChar {
    public static void main(String[] args) {

        String str = "Write a program that creates a group of given size thisisabigword";
        String [] arr = str.trim().split(" ") ;

        int biggestLength = 0;
        String biggestWord = "";

        for (String word: arr){
            if (word.length() > biggestLength){
                biggestLength = word.length();
                biggestWord = word;

            }
        }
        System.out.println(biggestWord);
      //  for (String word : arr){
        //    if (word.length() == biggestLength){
          //      System.out.println(word);
            //}
        //}
       }

    }

