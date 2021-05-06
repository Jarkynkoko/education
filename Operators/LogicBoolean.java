package Operators;

public class LogicBoolean {
    public static void main(String[] args) {

        System.out.println(5 > 4 && 6 < 7 ); // both of them true and false is false
        // if 5 < 6 && 3  < 4 || false is bothe of them will be falsefalse
        System.out.println(4 < 3  ||false);

        boolean b = 5 < 7; // true
        System.out.println(b);
        boolean d = false;
        boolean check = d || b || false;// true
        boolean check2 = d && b;// false left side doesnt check
        System.out.println(b);
        System.out.println(check);
        System.out.println(check2);

        ///&& both of the statments need to be true  for the true
        // OR || --- only one of the statments needs to be true


        int age = 5;
        int age2 = 6;
        boolean ageB = age != age2 || true;
        int ageBB = age = age2;
        System.out.println(ageB);//false
        System.out.println(ageBB);// true
        System.out.println(!ageB);//!false-- true
        System.out.println(!false);


        System.out.println(5 <= 5);

        //&&  and || short operators
        // THE REGULARS USE THE OPERATORS WOULD BE SİNGLE SİNGS: & |

        System.out.println(4 != 4 & 7< 4);// both side executed
        System.out.println();

    }
}
