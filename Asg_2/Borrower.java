package Asg_2;
import java.util.*;
public class Borrower {
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    Borrower(String name){
        this.name = name;
    }

    void addBorrowed(Book book){
        borrowedBooks.add(book);
        System.out.println(name + " Borrowed: " + book.getTitle());
    }

    void removeBorrowed(Book book){
        borrowedBooks.remove(book);
        System.out.println(name + " Returned: " + book.getTitle());
    }

    public String getName() {
        return name;
    }

    void displayBorrowedBooks(){
        System.out.println(name+"'s Borrowed Books: ");
        for (Book book : borrowedBooks){
            book.printfinfo();    
        }
    }
}