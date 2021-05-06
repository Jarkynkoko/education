package Practice;

public class ArrLoopGreaterWords {

    public static void main(String[] args) {
        String [] words = {"Aya","danik","alim", "Jazgul","jarkyn", "Aziz"};
        int count = 0;

        for (String word: words){

            char first = word.charAt(0);

            if (first >= 97 && first <= 122){
                System.out.println(word);
                count ++;
            }
        }
        System.out.println(count);


    }
}
