package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class librarySearchBook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
        Arrays.sort(books);

        System.out.println("Enter the book: ");

        String userBook = scan.nextLine();


        int index = Arrays.binarySearch(books,userBook);

        if (index>= 0){
            System.out.println("What book will you replace " +  userBook + "with");
            String newBook = scan.nextLine();
            books[index] = newBook;
        }else {
            System.out.println("Book not found ");
        }
        System.out.println(Arrays.toString(books));

        }
    }

