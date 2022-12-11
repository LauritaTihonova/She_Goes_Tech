package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HM10 {
    public static void main(String[] args) {


        int [] array  = {1789, 2035, 1899, 1456, 2013, 4458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println("Original array: " + Arrays.toString(array));

        /*int [] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            reverseArray[i] = array[array.length-1-i];
        }
        System.out.println("Reverse array (by creating new array): " + Arrays.toString(reverseArray));*/

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array [i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(array));
    }
}
