package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        // Declaring ArrayList
        ArrayList<String> car = new ArrayList<>();

        // Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        // Print out all elements
        System.out.println(car);

        // Get elements by the index
        System.out.println(car.get(0));

        // Add element at specific index
        car.add(2, "Toyota");
        System.out.println(car);

        // Change elements value
        car.set(3, "Ford");
        System.out.println(car);

        // Remove elements
        car.remove(5);
        car.remove("Mercedes");
        System.out.println(car);

        // Size
        System.out.println(car.size());

        // Delete all elements
        car.clear();
        System.out.println(car);

    }
}
