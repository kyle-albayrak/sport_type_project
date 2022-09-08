package org.example;

public class Service_Class {
    Football f1 = new Football();

    public void TableOutput() {
        //Select * FROM Football and print to screen
    }

    public Football SingleOutput(int AthleteID) {
        return f1;
    }

    public void AddPlayerDB(Football f1) {
        //run query with DB interraction
        /* insert into DB (Name, Pos, Region)
        VALUES(f1.name, f1.PlayerPosition, f1.Region)
         */

    }

    public void DeletePlayerDB(int i) {
        //run query with DB interractions to drop a user using his id
        //DELETE FROM Football WHERE AthleteID = i;
    }

    public void AlterPlayerDB(Football f1) {
        //run query where we alter a value in a database
        //Update DB SET Name = f1.Name, PlayerPosition = f1.PlayerPosition,
        //Region = f1.Region where AthleteID = x


    }

    public String Exception() {
        return "The user input was not inputted correctly";
    }
}