package oop;

public class Car {

    // Fields - these are field names

    private String color;
    private String brand;
    private int maxSpeed;

    // Set methods (like the middleman to use those fields), (setColor is a name of a method)

    public void setColor(String color){
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 30 ) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid input!");
        }
    }
    // Get method, to interact with fields and get values from field

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Method

    public void printCarInfo() {
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + maxSpeed);
    }
}
