
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int counter = 0;
        for (Integer list1 : list) {
            counter += list.get(list.indexOf(list1));
        }
        return counter;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double) (sum(list)) / (list.size());
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        //1. Get the average of all numbers in the list or "sampleMean"
        double sampleMean = average(list);
       
        double var = 0;
        for(int number:list){
        double difference = number-sampleMean;
        double squareOfDifference = difference * difference;
        var = var + squareOfDifference;        
        }
        
        var = var / (list.size()-1);
       
        return var;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
