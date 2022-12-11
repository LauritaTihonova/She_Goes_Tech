package homeworks;

import java.util.Scanner;

public class HM9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tree size: ");

        int size = scanner.nextInt();


        //levels
        for (int i = 0; i < size; i++) {

            //spaces
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int i= 0; i < size-1; i++) {
                System.out.print(" ");
            }
        System.out.print("#");




        /*for (int i = 0; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        for (int i = 0; i < size-1; i++)
            System.out.print(" ");
            System.out.print("# ");*/
        }
    }



