package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // Arrays starts with 0, so [0], [1] etc.
        // Declare array that will store 3 elements of type String
        String[] names = new String[3];

        // Setting element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        // Getting value from array
        System.out.println(names[2]);

        // Length
        System.out.println(names.length);
        System.out.println();


        // Declare and initialize array at the same time - second way
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Opel", "Ford"};

        // Iterate through all elements in array with for loop
        for (int i = 0; i < dreamCars.length; i++) {
            System.out.println(i+1 + "." + dreamCars[i]);
        }
        System.out.println();

        // Same thing, but using For-each loop
        for (String car: dreamCars) {
            System.out.println("Hello car: " + car);
        }

        System.out.println(Arrays.toString(dreamCars));  //to print out all in arrays

        //Example

        int table [] = {321,32,33,47,5,666,76,56,230};
        for (int value: table) {
            if (value % 2 == 0 ) {
                System.out.println(value + " - even number");
            }else {
                System.out.println(value + " - odd number");}
        }

    }
}
