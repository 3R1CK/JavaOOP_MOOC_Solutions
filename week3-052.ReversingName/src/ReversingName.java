import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name= reader.nextLine();
        
        int counter= 0;
        int size = name.length()-1;
        System.out.print("In reverse order: ");
        while(counter<name.length()){
            System.out.print(name.charAt(size));
            counter++;
            size--;
        
        }
    }
}
