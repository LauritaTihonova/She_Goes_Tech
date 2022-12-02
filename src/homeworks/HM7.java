package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the required size of the array:");
            int number = scanner.nextInt();

            int [] array = new int [number];

            for (int i = 0; i < array.length; i++) {
                System.out.println("Please enter element number:" + (i+1));
                array [i] =scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));
        }

    }
