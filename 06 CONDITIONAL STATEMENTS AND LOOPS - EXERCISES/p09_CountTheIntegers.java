import java.util.Scanner;

public class p09_CountTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int counter = 0;

        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                counter++;
            } catch (Exception e) {
                System.out.println(counter);
                break;
            }
        }
    }
}
