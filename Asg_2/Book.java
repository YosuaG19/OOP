package Asg_2;
public class Book {
    String title;
    String ISBN;
    Author author;

    Book (String title, String ISBN, Author author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    void printfinfo(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author.getNama());
        System.out.println("Biography: " + author.getBio());
        System.out.println("--------------------------------------");
    }
}
