package p13_VowelOrDigit;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);

        boolean asd = Character.isDigit(input);
        if (Character.isDigit(input)) {
            System.out.println("digit");
        } else if (input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U' ||
                input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
