import java.util.Scanner;

public class p12_NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("It is a number.");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
