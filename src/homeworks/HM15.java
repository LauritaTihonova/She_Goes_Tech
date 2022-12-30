package homeworks;

import java.util.Scanner;

public class HM15 {


    public static void main(String[] args) {
        rockPaperScissors();
    }

    public static String rockPaperScissors (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter player's 1 choice: ");
        String player1 = scanner.nextLine().trim().replaceAll(" ", "").toLowerCase();
        System.out.println("Please enter player's 2 choice: ");
        String player2 = scanner.nextLine().trim().replaceAll(" ", "").toLowerCase();

        if (player1.equals(player2)) {
            System.out.println("It's a tie!");
        } else if ((player1.equals("rock") && player2.equals("paper")) || (player1.equals("paper") && player2.equals("scissors")) || (player1.equals("scissors") && player2.equals("rock"))) {
            System.out.println("Player 2 won!");
        } else if ((player1.equals("paper") && player2.equals("rock")) || (player1.equals("scissors") && player2.equals("paper")) || (player1.equals("rock") && player2.equals("scissors"))){
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Invalid input!");
        }
        return rockPaperScissors();
    }

}
