package org.example;

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class menu {
    static Scanner s1 = new Scanner(System.in);
    static Menu_Service m1 = new Menu_Service();
    static Service_Class se1 = new Service_Class();
    static String username = "";
    static int decision = 0;
    static Boolean a = true;
    public static void main(String[] args) {

        //do {
            //a = se1.SqlConnections();
            System.out.print("Welcome Back to the Revature Football Complex" +
                    "\nComplex GM:");
            username = s1.nextLine();
            System.out.println("\nWelcome in Mr/Ms " + username);
            System.out.println("This is the menu for the Revature Fighting Eagles\n\nThe Eagles were 8-8 last year finishing " +
                    "just\noutside the playoffs in the JFL Java Football League");
            do {
                System.out.println("\nEnter 1 to view the team, 2 to add a player,\n3 to make changes to a player, 4 to remove a player" +
                        " and 5 to quit\nUser Input: ");
                Menu_Service.Entry(decision = Integer.parseInt(s1.nextLine()));
            } while (decision != 5);
        //}while(a == true);




    }
}