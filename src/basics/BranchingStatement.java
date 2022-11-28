package basics;

public class BranchingStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            if ( i == 1 ) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if ( i == 8 ) {  // It will skip 8 and going to continue the count
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 > 0) {        // We want to print even numbers
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {        // We want to print even numbers
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i <= 100; i= i+2) { // We want to print even numbers
            System.out.print(i + " ");
        }







        }
}
