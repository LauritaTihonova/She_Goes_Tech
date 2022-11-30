package homeworks;

public class HM6 {
    public static void main(String[] args) {
        /* Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/

        char letter = 'A';
        do {
            System.out.print(letter + " ");
            letter++;
        } while (letter <= 'Z');

    }
}


     /*   for (char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print(ch + " ");
    }
}*/
