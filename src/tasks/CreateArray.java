package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number:");
        int number = scanner.nextInt();

        int [] array = new int [number];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter element number:" + (i+1));
            array [i] =scanner.nextInt();
            }
          System.out.println(Arrays.toString(array));
         }
}
