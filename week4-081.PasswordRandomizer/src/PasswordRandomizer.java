
import java.util.Random;
import sun.security.util.Length;

public class PasswordRandomizer {

    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pwd="";

        int counter = 0;

        while (counter < this.length) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            pwd += symbol;
            counter++;
        }

        return pwd;
    }
}
