package oop;

public class CallingApartmentClass {
    public static void main(String[] args) {

        Apartment apartment1 = new Apartment(3, 5, 90.7d, "Rīgas Street", true );
        apartment1.printApartmentInfo();

        Apartment apartment2 = new Apartment();
        apartment2.printApartmentInfo();

        Apartment apartment3 = new Apartment(4, "Vilnius Street");
        apartment3.printApartmentInfo();

    }
}
