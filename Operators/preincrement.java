package Operators;

public class preincrement {
    public static void main(String[] args) {
        int age = 5;

        System.out.println(age); // 5
        System.out.println(++age);// 6
        System.out.println(age++);// 6
        System.out.println(age); // 6 after 7

        int x = 11;
        int y = x++; // int y = 11; then x increments post is the after

        // ++x will 12 preincrement

        System.out.println("x=" + x ); /// wholebecomese are string
        System.out.println("y=" + y);
        System.out.println(y);
    }

}
