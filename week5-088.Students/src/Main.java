
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        ArrayList<Student> StudentsList = new ArrayList<Student>();
        Scanner scn = new Scanner(System.in);

        while (true) {
            String name = scn.nextLine();

            if (name.isEmpty()) {
                for (Student stn : StudentsList) {
                    System.out.println("name: " + stn.getName());
                    System.out.println("studentnumber: " + stn.getStudentNumber());
                }
                System.out.println("name: \n");
                for (Student stn1 : StudentsList) {
                    System.out.println(stn1);
                }
                System.out.println("");
                break;
            } else {
                String studentNo = scn.nextLine();
                StudentsList.add(new Student(name, studentNo));
            }
        }

        System.out.println("Give the search term: ");
        String searchWord = scn.nextLine();
        System.out.println("Result:");
        for(Student searched : StudentsList){
            if(searched.toString().contains(searchWord)){
                System.out.println(searched);
            }
        }

        /*  Student pekka = new Student("Erick Mejia", "n9800891");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);*/
    }
}
