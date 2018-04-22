import java.util.Scanner;

public class p05_WordsInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.endsWith("y")) {
            input = input.substring(0, input.length() - 1);
            input = input + "ies";
            System.out.println(input);
        } else if (input.endsWith("o") ||
                input.endsWith("ch") ||
                input.endsWith("s") ||
                input.endsWith("sh") ||
		input.endsWith("x") ||
                input.endsWith("z")) {
            input = input + "es";
            System.out.println(input);
        } else {
            input = input + "s";
            System.out.println(input);
        }
    }
}
