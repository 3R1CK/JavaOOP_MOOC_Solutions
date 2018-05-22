
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 0;
        int result = 0;
        int counter =0;
        System.out.println("Type a number ");
        number = Integer.parseInt(reader.nextLine());
        
        while(counter<=number){
        result += (int)Math.pow(2, counter);
        counter++;
        }
        System.out.println("The result is "+result);
    }
}
