package homeworks;

import java.util.Scanner;

public class HM13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any year: ");
        int year = scanner.nextInt();

        determineLeapYear(year);
        String answer = determineLeapYearString(year);
        System.out.println(answer);
    }

    public static void determineLeapYear(int year) {
        if (year %400 ==0 || year % 4 ==0 && year % 100 !=0) {
            System.out.println("Leap year!");
        } else {
            System.out.println("It's not a leap year!");
        }
    }
    public static String determineLeapYearString(int year) {
        String answer;

        if (year %400 ==0 || year % 4 ==0 && year % 100 !=0) {
            answer = "Leap Year!";
        } else {
            answer = "It's not a leap year!";
        }
        return answer;
    }
}
