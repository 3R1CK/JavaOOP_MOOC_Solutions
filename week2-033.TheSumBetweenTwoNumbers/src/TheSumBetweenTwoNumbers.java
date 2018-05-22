
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0;
        int lastNumber =0;
        int sum=0;
        
        System.out.println("First: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        lastNumber= Integer.parseInt(reader.nextLine());
        
        while(firstNumber<=lastNumber){
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum "+ sum);
    }
}
