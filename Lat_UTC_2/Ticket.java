package Lat_UTC_2;

public class Ticket {
    int id;
    double price;
    boolean paymentStatus = true;
    Customer customer;

    Ticket(int id, double price, Customer customer){
        this.id = id;
        this.price = price;
        this.customer = customer;
    }

    int getId() {
        return id;
    }

    double getPrice() {
        return price;
    }

    boolean getPaymentStatus(){
        return paymentStatus;
    }

    void displayInShowtime(){
        System.out.printf("* Ticket ID: %d, Price: $%.1f, Customer: %s, Payment Status: %s\n", id, price, customer.getname(), paymentStatus ? "Paid" : "Unpaid");
    }

    void getCustomerName(){
        System.out.printf("- Name: %s, Age: %d\n", customer.getname(), customer.getAge());
    }
}