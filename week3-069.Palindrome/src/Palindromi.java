import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        int startChar = (text.length()-1);
        int endChar = text.length();
        String word ="";
        int counter =0;
        
        while (counter <= text.length()-1) {            
            word += text.substring(startChar, endChar);
            startChar--;
            endChar--;
            counter++;
        }
        
        if(word.equals(text)){
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
