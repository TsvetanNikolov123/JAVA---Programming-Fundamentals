import java.util.Scanner;

public class p06_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age <= 0 || age > 122) {
            System.out.println("Error!");
            return;
        }
        if (dayOfWeek.equals("Weekday")) {
            if (age <= 18) {
                System.out.println("12$");
            } else if (age <= 64) {
                System.out.println("18$");
            } else if (age <= 122) {
                System.out.println("12$");
            }
        } else if (dayOfWeek.equals("Weekend")) {
            if (age <= 18) {
                System.out.println("15$");
            } else if (age <= 64) {
                System.out.println("20$");
            } else if (age <= 122) {
                System.out.println("15$");
            }
        } else if (dayOfWeek.equals("Holiday")) {
            if (age <= 18) {
                System.out.println("5$");
            } else if (age <= 64) {
                System.out.println("12$");
            } else if (age <= 122) {
                System.out.println("10$");
            }
        }
    }
}
