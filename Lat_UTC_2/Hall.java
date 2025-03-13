package Lat_UTC_2;

import java.util.ArrayList;

public class Hall {
    int hallNumber, capacity;
    ArrayList<Showtime> showtimes = new ArrayList<Showtime>();

    Hall(int hallNumber, int capacity){
        this.hallNumber = hallNumber;
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    void addShowtime(Showtime newShowtime){
        showtimes.add(newShowtime);
    }

    void displayInfo(){
        for(Showtime showtime : showtimes){
            System.out.println("Showtimes:");
            showtime.displayInfo();
        }
    }

    void getCustomer(){
        for(Showtime showtime : showtimes){
            showtime.displayCostumer();
        }
    }
}
