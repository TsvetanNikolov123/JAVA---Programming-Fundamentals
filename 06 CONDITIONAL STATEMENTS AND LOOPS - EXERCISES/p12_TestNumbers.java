import java.util.Scanner;

public class p12_TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int maxSum = Integer.parseInt(scanner.nextLine());
        int combinationsCount = 0;
        int totalSum = 0;

        for (int i = number1; i >= 1; i--) {
            for (int j = 1; j <= number2; j++) {
                totalSum += 3 * i * j;
                combinationsCount++;
                if (totalSum >= maxSum) {
                    System.out.printf("%d combinations%n", combinationsCount);
                    System.out.printf("Sum: %d >= %d", totalSum, maxSum);
                    return;
                }
            }
        }

        System.out.printf("%d combinations%n", combinationsCount);
        System.out.printf("Sum: %d", totalSum);
    }
}
