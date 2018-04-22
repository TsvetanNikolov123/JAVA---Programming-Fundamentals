import java.util.Scanner;

public class p11_OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                System.out.println("Please write an odd number.");
            } else {
                System.out.println("The number is: " + Math.abs(num));
                break;
            }
        }
    }
}
