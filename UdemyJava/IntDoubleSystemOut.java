package UdemyJava;

public class IntDoubleSystemOut {
    public static void main(String[] args) {
        System.out.println("Milk");
        System.out.println(" \t Semi- skimmed");
        System.out.println("\t Medium");
        System.out.println("Egga");
        System.out.println("\t Free- range");
        System.out.println("Bread");


        System.out.print("The\n\t Cake \n IS \t A \n \t Lie\n ");

        int foo = 2;
        double bar = foo;

        System.out.println(foo);
        System.out.println(bar);

        double foo2 = 2.6;
        int bar2 = (int) foo2;

        System.out.println(foo2);
        System.out.println(bar2);

        int foo3 = 17;
        int bar3 = 4;

        System.out.println(foo3 / bar3);
        System.out.println((double) foo3 / bar3);
        System.out.println((double)(foo3 / bar3));
        System.out.println(foo3 / (double)bar3);

    }
}
