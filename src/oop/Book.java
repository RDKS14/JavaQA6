package oop;

public class Book {

    private String name;

    private int age;

    private String genre;

    private boolean fiction;

    public static String owner = " Robert ";

    public String details() {
        return "Book title is " + name + " Released " + age + " Years ago and belongs to Genre " + genre + " Is this fiction " + fiction;
    }
    public String toString() {
        return "Book title is " + name + " Released " + age + " Years ago and belongs to Genre " + genre + " Is this fiction " + fiction;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 999) {
            System.out.println("Invalid age " + age);
        } else {
            this.age = age;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {

    }
    public Book(){

    }
    public Book(String name, int age, String genre, boolean fiction ) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.fiction = fiction;
    }
}
