
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string

        String help = "";
        int startChar = (text.length() - 1);
        int endChar = text.length();
        int counter = 0;
        while (counter <= text.length() - 1) {

            help += text.substring(startChar, endChar);
            startChar--;
            endChar--;
            counter++;

        }

//        while(counter<= text.length()){
//        help= text.substring(textLength);
//        counter++;
//        textLength--;
//        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
