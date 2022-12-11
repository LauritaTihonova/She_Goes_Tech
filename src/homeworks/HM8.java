package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HM8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the required size of the array:");
        int number = scanner.nextInt();

        float [] array = new float [number];
        float sum = 0;

        System.out.println("Enter the grades of the array one by one");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter grade number:" + (i+1));
            array [i] =scanner.nextFloat();
            sum += array[i];
        }

            System.out.println("Average grade: " + (sum/array.length));
            System.out.println("There was passed " + array.length + " values");
        }
    }


