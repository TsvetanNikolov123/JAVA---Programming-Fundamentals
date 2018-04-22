import java.security.PublicKey;
import java.util.Scanner;

// 83/100
public class p08_CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int cheese = 0;
        int tomatoSauce = 0;
        int salami = 0;
        int pepper = 0;

        for (int i = 1; i <= n; i++) {
            String ingredients = scanner.nextLine().toLowerCase();
            if (ingredients.equals("cheese")) {
                cheese++;
            } else if (ingredients.equals("tomato sauce")) {
                tomatoSauce++;
            } else if (ingredients.equals("salami")) {
                salami++;
            } else if (ingredients.equals("pepper")) {
                pepper++;
            }
        }
        int cheeseCal = cheese * 500;
        int tomatoSauceCal = tomatoSauce * 150;
        int salamiCal = salami * 600;
        int pepperCal = pepper * 50;
        int totalCal = cheeseCal + tomatoSauceCal + salamiCal + pepperCal;

        System.out.printf("Total calories: %d", totalCal);
    }
}
