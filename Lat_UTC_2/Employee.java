package Lat_UTC_2;

public class Employee {
    String name, role;

    Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    String getName(){
        return name;
    }

    String getRole(){
        return role;
    }

    void displayInfo(){
        System.out.println("- Name; " + name + ", Role: " + role);
    }
}
