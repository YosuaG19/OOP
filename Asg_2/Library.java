package Asg_2;
import java.util.*;
public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    void addBook(Book book){
        books.add(book);
        System.out.println("Book added to Library: " + book.getTitle());
    }

    void borrowBook (Borrower borrower, Book book){
        borrower.addBorrowed(book);
        books.remove(book);
    }

    void returnBook(Borrower borrower, Book book){
        borrower.removeBorrowed(book);
        books.add(book);
    }

    void displayLibraryBooks(){
        System.out.println("Book in Library: ");
        for (Book book: books){
            book.printfinfo();
        }
    }
}
