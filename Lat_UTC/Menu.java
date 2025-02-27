package Lat_UTC;

import java.util.Scanner;

public class Menu {
    Menu(){
        System.out.println("1) Register A Document");
        System.out.println("2) View all Documents");
        System.out.println("3) Approve A Document");
        System.out.println("4) Exit");
    }

    void Press_Enter(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Press enter to continue...."); enter.nextLine();
    }
}
