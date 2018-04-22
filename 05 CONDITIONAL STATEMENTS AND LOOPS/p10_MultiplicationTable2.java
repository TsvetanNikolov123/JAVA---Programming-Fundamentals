import java.util.Scanner;

public class p10_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplayer = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, multiplayer, number * multiplayer);
            multiplayer++;
        } while (multiplayer <= 10);
    }
}
