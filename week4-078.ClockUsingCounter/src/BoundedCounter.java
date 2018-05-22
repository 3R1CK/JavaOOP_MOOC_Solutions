/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emeji
 */
public class BoundedCounter {
 
    private int value;
    private int upperLimit;
 
    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }
 
    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
 
    public int getValue() {
        // write here code that returns the value
        return this.value;
    }
 
    public void setValue(int newValue) {
         
        if(newValue>0 && newValue<=this.upperLimit){
            this.value = newValue;
        }       
    }
 
    @Override
    public String toString() {
        // write code here
        String numberFormat = "";
        if (this.value < 10) {
            numberFormat = "0" + this.value;
        } else {
            numberFormat = "" + this.value;
        }
        return numberFormat;
    }
}