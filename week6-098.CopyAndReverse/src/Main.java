
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));

    }

    public static int[] copy(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    public static int[] reverseCopy(int[] array) {
        int x =0;
        int[] array1 = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            array1[x] = array[i];
            x++;
        }
        return array1;
    }
}
