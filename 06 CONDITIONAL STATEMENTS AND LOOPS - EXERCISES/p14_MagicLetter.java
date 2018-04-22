import java.util.Scanner;

public class p14_MagicLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);
        char invalidChar = scanner.nextLine().charAt(0);

        for (char i = startChar; i <= endChar; i++) {
            if (i == invalidChar) {
                continue;
            }
            for (char j = startChar; j <= endChar; j++) {
                if (j == invalidChar) {
                    continue;
                }
                for (char k = startChar; k <= endChar; k++) {
                    if (k == invalidChar) {
                        continue;
                    }
                    System.out.print("" + i + j + k + " ");
                }
            }
        }
    }
}
