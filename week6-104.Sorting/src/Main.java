
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];

        for (int elemt : array) {
            if (elemt < smallest) {
                smallest = elemt;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int getIndex = 0;
        int smallestVal = smallest(array);
        for (int element : array) {
            if (element == smallestVal) {
                break;
            }
            getIndex++;
        }
        return getIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here        
        int newIndex = 0;
        int getIndex = index;
        int smallestVal = array[index];
        for (int element : array) {
            // Start checking values at the specified index
            if (newIndex >= index) {
                // Change the smalles values if the current list element is greater.               
                if (smallestVal >= element) {
                    smallestVal = element;
                    getIndex = newIndex;
                }
            }
            newIndex++;
        }
        //System.out.println("SMALLEST " + smallestVal);
        return getIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int countIndex = 0;
        int numberOne = array[index1];
        int numberTwo = array[index2];

        for (int element : array) {
            if (countIndex == index1) {
                array[index2] = numberOne;
            } else if (countIndex == index2) {
                array[index1] = numberTwo;
            }
            countIndex++;
        }
    }

    public static void sort(int[] array) {

        int indexStart = 0;
        int smallestIndx = 0;

        for (int numbers : array) {
            System.out.println(Arrays.toString(array));
            smallestIndx = indexOfTheSmallestStartingFrom(array, indexStart);
            swap(array, smallestIndx, indexStart);
            indexStart++;

        }
    }
}
