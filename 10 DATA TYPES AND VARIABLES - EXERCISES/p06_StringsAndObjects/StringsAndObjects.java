package p06_StringsAndObjects;

import java.util.Scanner;

public class StringsAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        Object result = null;
        result = firstInput + " " + secondInput;

        System.out.println(result);
    }
}
