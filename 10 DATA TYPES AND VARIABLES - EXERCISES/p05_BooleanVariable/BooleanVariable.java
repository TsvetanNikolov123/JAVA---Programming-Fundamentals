package p05_BooleanVariable;

import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if ("True".equals(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
