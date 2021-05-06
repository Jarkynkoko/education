package Methods;

public class loginUser {
    public static void main(String[] args) {
        //loginMethods("james123", "123456");
        if (loginMethods("james123","123456")){
            System.out.println("login in");
        }else {
            System.out.println("invalid");
        }
        System.out.println(loginMethods("james123", "123456"));
    }
    public static boolean loginMethods (String userName, String userPass){
        String validName = "james123";
        String validPass = "123456";

        if (validName.equals(userName)){

            if (validPass.equals(userPass)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
