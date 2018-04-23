package p07_ExchangeVariableValues;

import java.util.Scanner;

public class ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Before:");
        System.out.println(String.format("a = %d", a));
        System.out.println(String.format("b = %d", b));

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After:");
        System.out.println(String.format("a = %d", a));
        System.out.println(String.format("b = %d", b));
    }
}
