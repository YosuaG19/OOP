package Lat_UTC_2;

import java.util.ArrayList;

public class Showtime {
    String time, date;
    Movie movie;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    Showtime(String time, String date, Movie movie){
        this.time = time;
        this.date = date;
        this.movie = movie;
    }

    void addTicket(Ticket newTicket){
        tickets.add(newTicket);
    }

    void displayInfo(){
        System.out.println("- Movie: " + movie.getTitle());
        System.out.println("- Time: " + time + ", Date: " + date);

        System.out.print("Tickets: ");
        if (tickets.size() == 0){
            System.out.print("No Ticket Booked Yet");
        } else{
            System.out.println();
            for(Ticket ticket : tickets){
                ticket.displayInShowtime();
            }
        }
    }

    void displayCostumer(){
        if (tickets.size() != 0){
            for (Ticket ticket : tickets){
                ticket.getCustomerName();
                System.out.println("Tickets: ");
                System.out.printf("* Ticket ID: %d, Movie: %s, Showtime: %s, Date: %s, Price: $%.1f, Payment Status: %s\n", ticket.getId(), movie.getTitle(), time, date, ticket.getPrice(), ticket.getPaymentStatus() ? "Paid" : "Unpaid");
            }
        }
    }
}
