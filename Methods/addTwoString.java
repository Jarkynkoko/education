package Methods;

public class addTwoString {
    public static void main(String[] args) {
      //  System.out.println(addingTwoString("day","name"));
      //  System.out.println(addingTwoString("name","day", 3));
        System.out.println(stringContaince("jamesjajl", "ja",2));

    }
    public static String addingTwoString(String firstWord, String secondWord){
       //String adding = word+word2;

      return firstWord+secondWord + firstWord;
        }
        public static String addingTwoString (String str,String str2, int times) {
            // only need this condition with substring
            //if (times <=0){
            //        return "";
            //  }
            String word = "";

            for (int i = 0; i < times; i++) {
                word += str;
                if (i == times - 1) {
                    break;
                }
                word += str2;
                //return word.substring(0,word.length()-str2.length());
            }
            return word;
    }
    public static boolean checkString(String word, String str){

        return word.toLowerCase().startsWith(str.toLowerCase());

    }
    public static boolean stringContaince(String word2, String starts,int times){

        int count =0;

       for (int i = 0; i < word2.length() - starts.length() + 1;i++){

           String sub = word2.substring(i, i + starts.length());
           // System.out.println(sub);
           if (sub.equals(starts)){
               count ++;
           }

       }
        if (times == count) return true;
        return false;
    }
}

