package tasks;

import java.util.Scanner;

public class MyTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value:");
        int amount = scanner.nextInt();

        int a = amount-(amount/10);
        int b = a-(a/10);
        int c = b-(b/10);
        System.out.println(c);


    }
}

