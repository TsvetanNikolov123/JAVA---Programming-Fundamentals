import java.util.Scanner;

public class p13_GameOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean itsAKindOfMagic = false;
        String lastMagic = "";
        int combinationsCount = 0;
        for (int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                combinationsCount++;
                if (i + j == magicNumber) {
                    lastMagic = String.format("Number found! %d + %d = %d", i, j, magicNumber);
                    itsAKindOfMagic = true;
                }
            }
        }

        if (itsAKindOfMagic) {
            System.out.println(lastMagic);
        }
        else {
            System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNumber);
        }
    }
}
