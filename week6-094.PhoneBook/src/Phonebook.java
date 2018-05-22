
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emeji
 */
public class Phonebook {

    private ArrayList<Person> persons;

    public Phonebook() {
        persons = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.persons.add(new Person(name, number));
    }

    public void printAll() {
        for (Person pr : persons) {
            System.out.println(pr.getName() + " number: " + pr.getNumber());
        }
    }

    public String searchNumber(String name) {
        for (Person pr : persons) {
            if (pr.getName().contains(name)) {
                return pr.getNumber();
            }
        }
        return "number not known";
    }
}
