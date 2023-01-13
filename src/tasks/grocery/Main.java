package tasks.grocery;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Setting scanner outside main method, so other methods could use scanner too!!
    private static GroceryList groceryList = new GroceryList(); // Setting outside main method!

    public static void main(String[] args) {

        boolean quit = false; // as long as we want program to run it will be false
        int choice = 0;
        printInstructions();

        while (!quit) {

            System.out.println("Enter your choice: ");

            // try - catch, to avoid some errors, to not crash program, user will get error message

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 0:
                        //print all options
                        printInstructions();
                        break;
                    case 1:
                        //print grocery list
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        //add item
                        addItem();
                        break;
                    case 3:
                        //modify item
                        modifyItem();
                        break;
                    case 4:
                        //remove item
                        removeItem();
                        break;
                    case 5:
                        //search item
                        searchItem();
                        break;
                    case 6:
                        //delete all items
                        groceryList.deleteAllItems();
                        break;
                    case 7:
                        quit = true;
                        break;
                    default: // default in switch statement is like else part in if-else statement
                        System.out.println("Input is not valid (0-7)");
                        break;
                }
            }catch (InputMismatchException e) {
                System.err.println("Wrong input! Integers only!");  // err from error
                scanner.nextLine(); // for user to write choice again, after error message
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress:"); // \n  new line
        System.out.println("\t 0 - To print choice options"); // \t  Tab
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.next());
    }
    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem); // -1, because arrays starts from 0
    }
    public static void removeItem(){
        System.out.println("Enter item's name: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }
    public static void searchItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.searchItem(searchItem)){
            System.out.println("Found: " + searchItem + " is in your grocery list!");
        }else {
            System.out.println(searchItem + " is not in your shopping list!");
        }
    }
}
