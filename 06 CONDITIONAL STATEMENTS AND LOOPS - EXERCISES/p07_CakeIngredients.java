import java.util.Scanner;

public class p07_CakeIngredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ingredient = scanner.nextLine();

        int counter = 0;
        while (!(ingredient.equals("Bake!"))) {
            System.out.printf("Adding ingredient %s.\n", ingredient);
            ingredient = scanner.nextLine();
            counter++;
        }
        System.out.printf("Preparing cake with %d ingredients.\n", counter);
    }
}
