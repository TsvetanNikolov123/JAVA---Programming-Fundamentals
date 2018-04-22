import java.util.Scanner;

public class p02_ChooseADrink2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double water = 0.7;
        double coffee = 1.0;
        double beer = 1.70;
        double tea = 1.20;

        switch (input) {
            case "Athlete":
                System.out.printf("The Athlete has to pay %.2f.", quantity * water);
                break;
            case "Businessman":
                System.out.printf("The Businessman has to pay %.2f.", (quantity * coffee));
                break;
            case "Businesswoman":
                System.out.printf("The Businesswoman has to pay %.2f.", (quantity * coffee));
                break;
            case "SoftUni Student":
                System.out.printf("The SoftUni Student has to pay %.2f.", (quantity * beer));
                break;
            default:
                System.out.printf("The %s has to pay %.2f.", input, (quantity * tea));
                break;
        }
    }
}
