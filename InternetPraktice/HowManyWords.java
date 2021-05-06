package InternetPraktice;

public class HowManyWords {
    public static void main(String[] args) {
        String [] words = {"knife", "wooden spoons", "  plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};

        int count = 0;
        String word = "";
        for(int i=0; i < words.length; i++) {
            word = words[i];
            count++;
           // if(words[i].trim().contains(" ")) {
               // System.out.println(count + " words in String");
            } System.out.println(count + " words in String");
        }

    }

