package Lat_UTC_2;

import java.util.ArrayList;

public class Cinema {
    String name, location;
    ArrayList<Hall> Halls = new ArrayList<Hall>();
    ArrayList<Employee> Employees = new ArrayList<Employee>();

    Cinema(String name, String location){
        this.name = name;
        this.location = location;
    }

    void addEmployee(Employee newEmployee){
        Employees.add(newEmployee);
    }

    void addHall(Hall newHall){
        Halls.add(newHall);
    }

    void displayCinemaInfo(){
        System.out.println("Cinema: " + name);
        System.out.println("Location: " + location);
        System.out.println();


        System.out.println("Employees: ");
        for (Employee employee : Employees){
            employee.displayInfo();
        }
        System.out.println();


        System.out.println("Halls: ");
        int i = 1;
        for (Hall hall : Halls){
            System.out.printf("Hall %d (Capacity: %d)\n", i, hall.getCapacity());
            hall.displayInfo();
            i++;
        }

        System.out.println("Customers: ");
        for (Hall hall : Halls){
            
            hall.getCustomer();
        }

    }
}
