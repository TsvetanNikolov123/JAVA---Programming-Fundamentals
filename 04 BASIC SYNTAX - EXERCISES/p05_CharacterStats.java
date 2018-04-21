import java.util.Scanner;

public class p05_CharacterStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int health = Integer.parseInt(scanner.nextLine());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int maxEnergy = Integer.parseInt(scanner.nextLine());

        System.out.printf("Name: %s%n", name);
        System.out.printf("Health: |%s%s|%n",
                repeatStr("|", health),
                repeatStr(".", maxHealth - health));
        System.out.printf("Energy: |%s%s|%n",
                repeatStr("|", energy),
                repeatStr(".", maxEnergy - energy));
    }

    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
