
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        readMarks(lukija);

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

    public static void readMarks(Scanner reader) {
        System.out.println("Type exam scores, -1 completes:");
        int[] counter = new int[6];
        double allScores = 0;
        double accepted = 0;
        double acceptancePerc=0;
        while (true) {
            int mark = Integer.parseInt(reader.nextLine());
            if (mark == (-1)) {
                break;
            }

            if (mark >= 0 && mark <= 29) {
                allScores++;
                counter[0]++;
            } else if (mark >= 30 && mark <= 34) {
                accepted++;
                allScores++;
                counter[1]++;
            } else if (mark >= 35 && mark <= 39) {
                accepted++;
                allScores++;
                counter[2]++;
            } else if (mark >= 40 && mark <= 44) {
                accepted++;
                allScores++;
                counter[3]++;
            } else if (mark >= 45 && mark <= 49) {
                accepted++;
                allScores++;
                counter[4]++;
            } else if (mark >= 50 && mark <= 60) {
                accepted++;
                allScores++;
                counter[5]++;
            } else {
            }
        }
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(counter[5]);

        System.out.print("4: ");
        printStars(counter[4]);

        System.out.print("3: ");
        printStars(counter[3]);

        System.out.print("2: ");
        printStars(counter[2]);

        System.out.print("1: ");
        printStars(counter[1]);

        System.out.print("0: ");
        printStars(counter[0]);
        
        acceptancePerc = (100*accepted)/allScores;

        System.out.println("Acceptance percentage: "+ acceptancePerc);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
