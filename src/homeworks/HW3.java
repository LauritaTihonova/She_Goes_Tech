package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        /*
        Write an application, that will read one number from the user (of type int) and check,
         if given number is "near" 100. A number is "near" 100 when difference between it is no bigger than 10.

         Your application should read one number (int) and print false or true on the screen,
         according to instruction above
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 110) {
            System.out.println("True!");}
            else {
                System.out.println("False!");
        }
    }
}
