
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
       this.amountOfNumbers=0;

    }

    public void addNumber(int number) {
        // code here
        this.sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        double avg = 0;
        if(sum!=0){
            avg= (double)sum/amountOfNumbers;
        }
        return avg;
    }
}
