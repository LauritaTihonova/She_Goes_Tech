package tasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int rand, guess, max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a max random range: ");
        max = scanner.nextInt();

        rand = (int) (Math.random() * (max+1) ); //because max values and + 1 to start from 1
        // System.out.println("Generated random number = " + rand);

        do {
            System.out.println("Guess the number:");
            guess = scanner.nextInt();

            if (guess < rand) {
                System.out.println("Try bigger!");
            } else if (guess > rand) {
                System.out.println("Try smaller!");
            }

        } while (guess!=rand); //keep going if user didn't guess

        System.out.println("Congratulations, you won!");


    }

}
