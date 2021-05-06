package Arrays;

public class beforDutsEmail {
    public static void main(String[] args) {

        String [] eMails = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com","Fran2113gmailcom","JamieM@yahoo.com"};

        for (int i = 0; i < eMails.length; i++){
            if (eMails[i].contains("@") && eMails[i].contains(".")){
                System.out.println(eMails[i]);

                int at = eMails[i].indexOf("@");
                int dot = eMails[i].indexOf(".");

                if (at < dot){
                    System.out.println(eMails[i] + " Valid");
                }else {
                    System.out.println(eMails[i] + " Invalid");
                }

            }else {
                System.out.println(eMails[i] + " Invalid");
            }
        }



    }
}
