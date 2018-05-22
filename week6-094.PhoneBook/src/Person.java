/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emeji
 */
public class Person {

    private String name;
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phone;
    }

    public void changeNumber(String newNumber) {
        this.phone = newNumber;
    }
    
    public String toString(){
        return this.getName() + " number: " + this.getNumber();
    }
    
}
