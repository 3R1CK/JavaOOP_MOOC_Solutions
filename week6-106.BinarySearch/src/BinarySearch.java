
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            if (searchedValue > array[end] || searchedValue < array[beginning]) {
                return false;
            }

            // restrict the search area 
            if (searchedValue > array[middle]) {
                beginning = middle+1;
            } else if (searchedValue < array[middle]) {
                end = middle-1;
            }
        }
        return false;
    }

    public static void printResult(boolean result, String value) {
        if (result) {
            System.out.println("Value " + value + " is in the array");
        } else {
            System.out.println("Value " + value + " is not in the array");
        }
    }
}
