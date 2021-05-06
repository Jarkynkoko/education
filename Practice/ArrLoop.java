package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrLoop {
    public static void main(String[] args) {

      String [] books = {"Harry Potter", "Jane Year", "OCTA", "Lord of rings"};
      Arrays.sort(books);

        System.out.println("Enter the book: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the book you want replace ");
        String book = scan.nextLine();

       int index = Arrays.binarySearch(books,book);

       if (index >= 0){
           System.out.println("What book will you replace " + books + " with");
           String newBook = scan.nextLine();
           books[index] = newBook;
       }else {
           System.out.println("Book not found");
       }
        System.out.println(Arrays.toString(books));

    }
}
