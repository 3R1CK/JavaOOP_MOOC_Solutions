
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        int x= 0;
        
        while(x< name.length()){
            System.out.println((x+1)+". character: " + name.charAt(x));
            x++;
        }
    }
}
