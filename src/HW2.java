import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        // Using scanner read speed in mp/h
        // Calculate and output in km/h
        // Example with input 122.7 mp/h    (miles per hour)
        // Output --> 122.7 mp/h in km/h would be equal to 197.46651


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the speed in mp/h: ");
        double speed = scanner.nextDouble();

        double result = speed * 1.60934;
        System.out.println(speed + " mp/h in km/h would be equal to " + result);
    }
}



