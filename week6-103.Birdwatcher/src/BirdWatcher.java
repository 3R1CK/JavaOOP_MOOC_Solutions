
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emeji
 */
public class BirdWatcher {

    private ArrayList<String> birdsWatched;
    private ArrayList<String> birdsLatin;
    private ArrayList<String> birdsObserved;

    public BirdWatcher() {
        birdsWatched = new ArrayList<String>();
        birdsLatin = new ArrayList<String>();
        birdsObserved = new ArrayList<String>();
    }

    public void getAnswer(Scanner reader) {
        String command;
        while (true) {
            System.out.print("? ");
            command = reader.nextLine();

            if (command.equals("Add")) {
                //do something
                addBird(reader);
            } else if (command.equals("Observation")) {
                //do something
                observedBird(reader);
            } else if (command.equals("Statistics")) {
                //do something
                statistics();
            } else if (command.equals("Show")) {
                //do something
                show(reader);
            } else if (command.equals("Quit")) {
                return;
            } else {
            }
        }
    }

    public void addBird(Scanner add) {
        System.out.print("Name: ");
        String newBird = add.nextLine();
        birdsWatched.add(newBird);
        System.out.print("Latin Name: ");
        String latinN = add.nextLine();
        birdsLatin.add(latinN);
    }

    public void observedBird(Scanner seen) {
        System.out.print("What was observed:? ");
        String observation = seen.nextLine();
        if (this.birdsWatched.contains(observation)) {
            this.birdsObserved.add(observation);
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        ArrayList<String> birdList = new ArrayList<String>();
        ArrayList<String> birdFormatted = new ArrayList<String>();
        int counter = 0;
        for (String brd : birdsWatched) {
            if (!birdList.contains(brd)) {
                birdList.add(brd);
                birdFormatted.add(brd + " (" + this.birdsLatin.get(counter) + "): "+ this.observationCount(brd));
            } else {
            }
            counter++;            
        }
        for(String pr : birdFormatted){
            System.out.println(pr);
        }
    }

    public void show(Scanner reader) {
        System.out.println("What?");
        String birdName = reader.nextLine();
        ArrayList<String> noRepBirds = this.formattedBirds();
        for (String birds : noRepBirds) {
            if (birds.contains(birdName)) {
                System.out.println(birds + this.observationCount(birdName));
            }
        }
    }

    public String observationCount(String birdName) {
        int countObservs = 0;
        for (String brd : this.birdsObserved) {
            if (brd.contains(birdName)) {
                countObservs++;
            }
        }
        return countObservs + " observations";
    }

    public ArrayList<String> unrepeatedBirds() {
        ArrayList<String> birdList = new ArrayList<String>();
        ArrayList<String> birdFormatted = new ArrayList<String>();
        int counter = 0;
        for (String brd : birdsWatched) {
            if (!birdList.contains(brd)) {
                birdList.add(brd);
            } else {
            }
            counter++;
        }
        return birdList;
    }

    public ArrayList<String> formattedBirds() {
        ArrayList<String> birdList = new ArrayList<String>();
        ArrayList<String> birdFormatted = new ArrayList<String>();
        int counter = 0;
        for (String brd : birdsWatched) {
            if (!birdList.contains(brd)) {
                birdList.add(brd);
                birdFormatted.add(brd + " (" + this.birdsLatin.get(counter) + "): ");
            } else {
            }
            counter++;
        }
        return birdFormatted;
    }
}
