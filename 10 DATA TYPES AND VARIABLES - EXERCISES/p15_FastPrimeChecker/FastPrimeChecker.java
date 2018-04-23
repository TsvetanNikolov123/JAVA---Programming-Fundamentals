package p15_FastPrimeChecker;

import java.util.Scanner;

public class FastPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            String isPrimeToString = "False";
            if (isPrime) {
                isPrimeToString = "True";
            }
            System.out.println(String.format("%d -> %s", i, isPrimeToString));
        }
    }
}
