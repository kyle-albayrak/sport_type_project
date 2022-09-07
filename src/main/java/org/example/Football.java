package org.example;


import java.util.Scanner;

public class Football {

    String Name;
    String NameUD;
    String Position;
    String PositionUD;
    String Region;
    String RegionUD;
    int AthleteID;
    int AthleteID1;
    int AthleteID2;
    Service_Class se1 = new Service_Class();
    Scanner s1 = new Scanner(System.in);

    public Football(){

    }
    public Football(String Name,String Position,String Region){
        this.Name = Name;
        this.Position = Position;
        this.Region = Region;
    }

    public void ViewTeam(){
        se1.TableOutput();
    }
    public void AddPlayer() {
        /*try {
            System.out.println("Enter the players first and last name separated by a comma: ");
            NameUD = s1.nextLine();
            System.out.println("Enter the players position shorthand is fine: ");
            PositionUD = s1.nextLine();
            System.out.println("Enter the single character code for your region (n = north, e = east," +
                    " w = west, s = south: ");
            RegionUD = s1.nextLine();
            //return new Football(NameUD, PositionUD, RegionUD);
            //se1.ADDPlayerDB(f1)
        } catch (se1.Exception e) {*/
            System.out.println("Enter the players first and last name separated by a comma: ");
            NameUD = s1.nextLine();
            System.out.println("Enter the players position shorthand is fine: ");
            PositionUD = s1.nextLine();
            System.out.println("Enter the single character code for your region (n = north, e = east," +
                    " w = west, s = south: ");
            RegionUD = s1.nextLine();
            //return new Football(NameUD, PositionUD, RegionUD);
            //se1.ADDPlayerDB(f1)
        }


    public void EditPlayer(){
        se1.TableOutput();
        System.out.println("Please enter the Athlete Number for the player you would like to edit: ");
        Football f2 = se1.SingleOutput(AthleteID = Integer.parseInt(s1.nextLine()));
        System.out.println("\n"+f2.Name +"\n"+f2.Position+"\n"+f2.Region);
        System.out.println("Enter the new player name: ");
        NameUD = s1.nextLine();
        System.out.println("Enter the new player position: ");
        PositionUD = s1.nextLine();
        System.out.println("Enter the character code for your region (N/W/S/E): ");
        RegionUD = s1.nextLine();
        Football f1 = new Football(NameUD, PositionUD, RegionUD);
        se1.AlterPlayerDB(f1);

    }

    public void RemovePlayer(){
        do {
            se1.TableOutput();
            System.out.println("Please Enter the Athlete Number for the player you'd like " +
                    "dropped from the squad: ");
            AthleteID1 = Integer.parseInt(s1.nextLine());
            System.out.println("Please Re-enter the Athlete Number to confirm:");
            AthleteID2 = Integer.parseInt(s1.nextLine());
        }while(AthleteID1 != AthleteID2);
        se1.DeletePlayerDB(AthleteID2);

    }



    /*public String Football_Query(){
        return "";
    }*/

    //public

}
