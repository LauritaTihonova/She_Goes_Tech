package tasks;

import java.util.Scanner;

public class MyTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet, lūdzu, savu komandas nosaukumu:");
        String nosaukums = scanner.nextLine();
        System.out.println("Lai veicas testā par Ziemassvētkiem, " + nosaukums +" komanda! :)");
        System.out.println();

        String[][] quizArray = new String[7][4];
        int[] answer = {2, 1, 3, 2, 3, 1, 2};
        int score = 0;

        quizArray[0][0] = "No kā tika veidota pirmā mākslīgā Ziemassvētku egle ?";
        quizArray[0][1] = "Tītara spalvām";
        quizArray[0][2] = "Zoss spalvām"; // pareizā
        quizArray[0][3] = "Strausa spalvām";

        quizArray[1][0] = "Ziemassvētku viena no tradicionālajām krāsām ir sarkanā. Ko tā simbolizē?";
        quizArray[1][1] = "Jēzus Kristus asinis"; // pareizā
        quizArray[1][2] = "Rūdolfa sarkano degunu";
        quizArray[1][3] = "JĀIZDOMĀ";

        quizArray[2][0] = "Kāda ir viena no populārākajām Ziemassvētku dāvanām?";
        quizArray[2][1] = "Saldumi";
        quizArray[2][2] = "Dāvanu kartes";
        quizArray[2][3] = "Lego"; // pareizā

        quizArray[3][0] = "Kam piederēja pirmā izgaismotā Ziemassvētku eglīte?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Mārtiņam Luteram"; // pareizā
        quizArray[3][3] = "Calgary";

        quizArray[4][0] = "Kura no šīm dziesmām bija pirmā dziesma atskaņota kosmosā?";
        quizArray[4][1] = "All I Want For Christmas Is You";
        quizArray[4][2] = "Sleight Ride";
        quizArray[4][3] = "Jingle Bells"; //pareizā

        quizArray[5][0] = "Cik daudz ziemeļbriežu ir Ziemassvētku vecītim?";
        quizArray[5][1] = "9"; // pareizā
        quizArray[5][2] = "7";
        quizArray[5][3] = "11";

        quizArray[6][0] = "ojdfgkjhdfgjhg?";
        quizArray[6][1] = "9";
        quizArray[6][2] = "7"; // pareizā
        quizArray[6][3] = "11";

        for (int i = 0; i < quizArray.length; i++) {
            System.out.println(quizArray[i][0]);
            for (int j = 1; j < quizArray[i].length; j++) {
                System.out.println("\t" + j + ") " + quizArray[i][j]);
            }
            System.out.println("Atbilde: ");
            int answerInput = scanner.nextInt();

            if (answerInput == answer[i]) {
                System.out.println("Pareizi!");
                score++;
            } else {
                System.out.println("Nepareizi!");
            }

        }
        System.out.println();
        System.out.println( nosaukums + " komanda, jūs atbildējāt pareizi uz " + score + " jautājumiem!");
        System.out.println();
        System.out.println("Apsveicu! :)");


    }
}

