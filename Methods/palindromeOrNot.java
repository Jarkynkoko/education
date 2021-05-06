package Methods;

public class palindromeOrNot {
    public static void main(String[] args) {
        System.out.println(isPalindrome("dkfjnd"));
        System.out.println(isPalindrome("kdfkv"));
    }
    public static boolean isPalindromeArr(String str) {

        char [] arr = str.toLowerCase().toCharArray();

        for(int i=0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length-1 -i])  {
                return false;
            }
        }

        return true;

    }
   public static boolean isPalindrome(String str) {

        String palindrome = "";


       for (int i = str.length() - 1; i >= 0; i--) {
           palindrome += str.charAt(i);
       }
       if (palindrome.equals(str)) {
           return true;
       }else {
           return false;
       }

   }
}
