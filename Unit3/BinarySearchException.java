import java.util.Arrays;

public class BinarySearchException {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};

        // Sort the array before performing binary search
        Arrays.sort(arr);

        int key = 7;

        try {
            int index = Arrays.binarySearch(arr, key);

            if (index >= 0) {
                System.out.println(key + " found at index " + index);
            } else {
                System.out.println(key + " not found in the array.");
            }
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred.");
            // e.printStackTrace();
        }
    }
}
