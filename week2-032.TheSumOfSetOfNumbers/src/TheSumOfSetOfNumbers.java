
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int lastNumber = 0;
        int counter =0;
        int sum =0;
        System.out.println("Until what? ");
        lastNumber = Integer.parseInt(reader.nextLine());
        
        while(counter<lastNumber){
            counter++;
            sum += counter;
          
        }
          System.out.println("Sum is: "+sum);
    }
}
