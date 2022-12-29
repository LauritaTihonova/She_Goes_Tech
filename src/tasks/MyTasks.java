package tasks;

import java.util.Scanner;

public class MyTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet, lūdzu, savu komandas nosaukumu:");
        String nosaukums = scanner.nextLine();
        System.out.println("Lai veicas testā par Ziemassvētkiem, ''" + nosaukums +"'' komanda! :)");
        System.out.println();

        String[][] quizArray = new String[10][4];
        int[] answer = {2, 1, 3, 2, 3, 1, 2, 1, 3, 3};
        int score = 0;

        quizArray[0][0] = "No kā tika veidota pirmā mākslīgā Ziemassvētku egle ?";
        quizArray[0][1] = "Tītara spalvām";
        quizArray[0][2] = "Zoss spalvām"; // +
        quizArray[0][3] = "Strausa spalvām";

        quizArray[1][0] = "Ziemassvētku viena no tradicionālajām krāsām ir sarkanā. Ko tā simbolizē?";
        quizArray[1][1] = "Jēzus Kristus asinis"; // +
        quizArray[1][2] = "Rūdolfa sarkano degunu";
        quizArray[1][3] = "Coca-colas dzērienu";

        quizArray[2][0] = "Kāda ir viena no populārākajām Ziemassvētku dāvanām?";
        quizArray[2][1] = "Saldumi";
        quizArray[2][2] = "Dāvanu kartes";
        quizArray[2][3] = "Lego"; // +

        quizArray[3][0] = "Kam piederēja pirmā izgaismotā Ziemassvētku eglīte?";
        quizArray[3][1] = "Džonam Teiloram";
        quizArray[3][2] = "Mārtiņam Luteram"; // +
        quizArray[3][3] = "Fredijam Merkūrijam";

        quizArray[4][0] = "Kura no šīm dziesmām bija pirmā dziesma atskaņota kosmosā?";
        quizArray[4][1] = "All I Want For Christmas Is You";
        quizArray[4][2] = "Sleight Ride";
        quizArray[4][3] = "Jingle Bells"; //+

        quizArray[5][0] = "Cik daudz ziemeļbriežu ir Ziemassvētku vecītim?";
        quizArray[5][1] = "9"; // +
        quizArray[5][2] = "7";
        quizArray[5][3] = "11";

        quizArray[6][0] = "Kura valsts pirmo reizi aizsāka tradīciju likt Ziemassvētku eglīti?";
        quizArray[6][1] = "Amerika";
        quizArray[6][2] = "Vācija"; // +
        quizArray[6][3] = "Dānija";

        quizArray[7][0] = "Kā spāņu valodā ir pateikt Priecīgus Ziemassvētkus?";
        quizArray[7][1] = "Feliz Navidad!"; // +
        quizArray[7][2] = "Alegre Navidad!";
        quizArray[7][3] = "Feacrenza Navidad!";

        quizArray[8][0] = "Uz kurieni Makkalisteri devās atvaļinājumā, kad atstāja Kevinu vienu pašu mājās pirmoreiz?";
        quizArray[8][1] = "Vašingtonu";
        quizArray[8][2] = "Londonu";
        quizArray[8][3] = "Parīzi"; // +

        quizArray[9][0] = "Kādā krāsā ir āmuļu ogas?";
        quizArray[9][1] = "Zaļas";
        quizArray[9][2] = "Sarkanas";
        quizArray[9][3] = "Baltas"; // +

        for (int i = 0; i < quizArray.length; i++) {
            System.out.println(quizArray[i][0]);
            for (int j = 1; j < quizArray[i].length; j++) {
                System.out.println("\t" + j + ") " + quizArray[i][j]);
            }
            System.out.println("Atbilde: ");
            int answerInput = scanner.nextInt();

            if (answerInput == answer[i]) {
                System.out.println("Pareizi!\n");
                score++;
            } else {
                System.out.println("Nepareizi!\n");
            }

        }
        System.out.println();
        System.out.println("''" + nosaukums + "'' komanda, jūs atbildējāt pareizi uz " + score + " no 10 jautājumiem!");
        System.out.println();
        System.out.println("Apsveicu! :)");


    }
}

