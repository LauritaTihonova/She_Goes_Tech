package homeworks;

import java.util.Arrays;

public class HM14 {
    public static void main(String[] args) {

        int [] myArray = {2, 5, 9, 96, 71, 54, 29, 36, 3, 100};
        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("Maximum value: " + max(myArray));
        System.out.println("Minimum value: " + min(myArray));
    }

    // Max

    public static int max (int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Min

    public static int min (int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
