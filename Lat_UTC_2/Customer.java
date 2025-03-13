package Lat_UTC_2;

import java.util.ArrayList;

public class Customer {
    String name;
    int age;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    Customer (String name, int age){
        this.name = name;
        this.age = age;
    }

    String getname(){
        return name;
    }

    public int getAge() {
        return age;
    }

    void addTicket(Ticket newTicket){
        tickets.add(newTicket);
    }

}
