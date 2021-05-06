package Methods;

public class reversedString {
    public static void main(String[] args) {
        System.out.println(reversString("java is fun"));
    }
    public static String  reversString(String words ){
        String reservWord = " ";
        for (int i = words.length()-1; i >= 0 ; i--){
            reservWord += words.charAt(i);
        }
        return reservWord;

    }
}
