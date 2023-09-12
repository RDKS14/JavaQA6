package oop;

public class Runner {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("Harry Potter and the Philosophers Stone ");
        book1.setAge(26);
        book1.setGenre("Fantasy and Adventure");
        book1.setFiction(true);

        System.out.println(book1.details());

        Book book2 = new Book("Harry Potter Chamber of Secrets", 25, "Fantasy", true);
        System.out.println(book2.getName());
        System.out.println(book1.getAge());
        System.out.println(book2 + Book.owner);


    }

    }





