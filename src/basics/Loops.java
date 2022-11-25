package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        System.out.println("Hello World!");  x10

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("This is while loop!");
            i++; //need to add this, otherwise print would be unlimited
         }



        i = 0;
        do {
            System.out.println("This is do while loop!");
            i++;
        } while (i <= 10);

        int input;
        do {
            System.out.println("Please enter number:");
            input = scanner.nextInt();
            System.out.println(input * 2);

        } while (input != 0);
    }
}
