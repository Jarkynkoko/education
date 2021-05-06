package test;

import java.util.Scanner;

public class BimProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //—> BMI Formula: BMI = mass / (height * height)
        //—> Values:
        //Less than 18.5 — Underweight
        //From 18.5 to 25 — Normal weight
        //From 25 to 30 — Overweight
        //More than or equal to 30 — Obese
       // double height;
        //double mass;
        //double bim = (mass/(height*height))

        System.out.println("Enter your mass in killogram");
        double mass = input.nextDouble();

        System.out.println("Enter the height");
        double height = input.nextDouble();

        double bim = (mass/ (height*height));


        if (bim < 18.5){
            System.out.println("Under weight");
        }else if(bim >= 18.5 && bim < 25){
            System.out.println("Underweight");
        }else if (bim >= 25 && bim < 30) {
            System.out.println("Normal weight");
        }else if (bim < 30 && bim >= 25){

            System.out.println("Overweight");
        }else if (bim >= 30){
            System.out.println("Obese");
        }






    }
}

