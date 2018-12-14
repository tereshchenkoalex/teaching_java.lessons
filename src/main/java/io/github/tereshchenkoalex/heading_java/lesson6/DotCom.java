package io.github.tereshchenkoalex.heading_java.lesson6;

import java.util.*;

public class DotCom {

    //variables:
    private ArrayList<String> locationCells; //an ArrayList of cell locations
    private String name; //the DotCom's name

    //A setter method that updates the DotCom's location (Random location provided by the GameHelper placeDotCom() method).
    public void setLocationCells (ArrayList<String> loc) {
        locationCells = loc;
    }

    //Basic setter method which updates the name of DotCom
    public void setName (String n) {
        name = n;
    }

    //method checkYourself which operates with String variable
    public String checkYourself (String userInput) {
        String result = "miss"; //default result is miss (if other hasn't been told)
        int index = locationCells.indexOf(userInput); //by asking the index of user's input (guess) we are checking if it is REALLY present in the list. If user's input is not in the list, then indexOf() will return  a -1
        if (index >= 0) { // 0 is bigger than -1, so user's input (guess) is in the list
            locationCells.remove(index); //we are deleting his index to avoid result duplication (e. g. A1 - hit, A1 - hit, A1 - sink).

            if (locationCells.isEmpty()) { //if list if empty - we killed a DotCom (at least one of them)
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit"; //if list is not empty BUT higher if was > 0 (and it was) this means that list is > 0 and not Empty - so it is hit
            } //close else
        } //close if (if index)
        return result; //miss or hit
    } //clos method
} //close class
