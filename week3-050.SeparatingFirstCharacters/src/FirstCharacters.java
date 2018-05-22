import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        for(int i=0; i<name.length(); i++){
            if(name.length()<2){
                System.out.println("");
            }
            else if(i<=2 && name.length()>=3){
            System.out.println((i+1)+ ". character: "+ name.charAt(i));
            }            
        }
    }
}
