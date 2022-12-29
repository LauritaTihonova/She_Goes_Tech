package oop;

public class CallingBookClass {

    public static void main(String[] args) {

        // Creating new book class object
        Book book1 = new Book();

        // Set public field values
        book1.title = "Test";
        book1.author = "Test author";

        // Set private field using setter method
        book1.setNumberOfPages(100);

        book1.printBookInfo();

        Book book2 = new Book();
        book2.title = "This is seconf book";
        book2.author = "Second author";
        book2.setNumberOfPages(-50);
        book2.printBookInfo();

    }
}
