package org.example;

import java.util.Scanner;

public class Menu_Service {
    Scanner s1 = new Scanner(System.in);
    static Football f1 = new Football();

    public static void Entry(int i) {
        String str = "";
        switch (i) {
            case 1:
                f1.ViewTeam();
                break;
            case 2:
                f1.AddPlayer();
                break;
            case 3:
                f1.EditPlayer();
                break;
            case 4:
                f1.RemovePlayer();
                break;
        }
    }
}
