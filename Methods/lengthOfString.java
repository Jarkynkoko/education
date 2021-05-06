package Methods;

public class lengthOfString {
    public static void main(String[] args) {
        equelLengths("name",4);
    }

    public static void equelLengths (String str, int len){
        if (str.length()== len){
            System.out.println("Equel");
        }else {
            System.out.println("Not equel");
        }
    }
}
