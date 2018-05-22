
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("Type the password:");
        String userPass = reader.nextLine();

        while (!userPass.equals(password)) {

            if (userPass.equals(password)) {

                break;
            } else {
                System.out.println("Wrong!");
            }
            System.out.println("Type the password:");
            userPass = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
    }
}
