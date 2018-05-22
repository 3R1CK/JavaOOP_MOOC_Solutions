import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            System.out.println("Type a number: ");
            int counter =0;
            int factorial =1;
            int number = Integer.parseInt(reader.nextLine());
            
            while(counter<number){
                counter++;
                factorial *= counter;
                System.out.println(factorial);
                  
            }
            System.out.println("Factorial is "+factorial);
    }
}
