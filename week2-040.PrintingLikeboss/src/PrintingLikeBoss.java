public class PrintingLikeBoss {

    // copy or rewrite the metihod of Assignment 39.1 here
    public static void printStars(int amount) {
       int counter =0;
        while(counter<amount){
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int counter =0;
        while(counter<amount){
            System.out.print(" ");
            counter++;
        }
       
    }

    public static void printTriangle(int size) {
        // 40.2
      int counter =0;
      int counter2= size;
      
      while(counter<size){
      counter2--;
      counter++;
          printWhitespaces(counter2);
          printStars(counter);
      }
       
    }

    public static void xmasTree(int height) {
        // 40.3
        int spaces = height;
        int stars = 1;
        int counter=0;
        
        while(counter<height){
            spaces--;
            printWhitespaces(spaces);
            printStars(stars);
            stars+=2;
            counter++;
        }
        for(int i=1; i<=2; i++){
            int stand= height -2;
            printWhitespaces(stand);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
