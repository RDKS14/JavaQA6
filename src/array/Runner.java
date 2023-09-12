package array;

import oop.Book;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


//        String[] bookNames = {" Harry Potter 1 ", " Harry Potter 2 ", "Harry Potter 3"};
//        for (int i = 0; i < bookNames.length; i++) {
//            System.out.println("I: " + i + " Name " + bookNames[i]);
//        }
//        for (String i : bookNames) {
//            System.out.println("Title is; " + i);
//        }

//       List<Book> books = new ArrayList<>();
//
//        books.add((new Book("Ghostbusters",34, "Fantasy", true)));
//        books.add((new Book("Marvels Avengers",34, "Fantasy", true)));
//        books.add((new Book("Godzilla",75, "Fantasy", true)));
//
//        for (Book a : books) System.out.println(a);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        for (Integer num : numbers)
            System.out.println(" Numbers " + num);
    }
}
