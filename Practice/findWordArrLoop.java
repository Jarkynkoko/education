package Practice;

public class findWordArrLoop {
    public static void main(String[] args) {

        String [] words = {"danik","Aya","Alim", "jazel", "aya", "AYA"};

        boolean check = false;
        int count = 0;
        String name = "";

       for (String word: words){
           if (word.equalsIgnoreCase("Aya")) {
               check = true;
               count++;
               name = word;

      }
        }if (check){
            System.out.println(name + " found " + count + " times");
        }
        else {
            System.out.println("Not found");
        }




    }
}
