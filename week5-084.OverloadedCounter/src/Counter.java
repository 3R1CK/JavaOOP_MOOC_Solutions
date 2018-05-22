/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emeji
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        startingValue++;
    }

    public void decrease() {
        if (this.startingValue <= 0 && this.check) {

        } else {
            this.startingValue--;
        }
    }
    
    public void increase(int increaseAmount){
        if(this.startingValue>0){
           if(increaseAmount>0){
                this.startingValue += increaseAmount;
           }
        }
    }
    
    public void decrease(int decreaseAmount){
        
        if(decreaseAmount>=0 ){
            if(this.startingValue>=0 && this.check==true){
                if(decreaseAmount>this.startingValue){
                    this.startingValue = 0;
                }else{
                    this.startingValue -= decreaseAmount;
                }
                
            }else if(this.check==false){
            this.startingValue -= decreaseAmount;

            }
        }
       
    }
}
