package p04_VariableInHexFormat;

import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hexInt = Long.decode(scanner.nextLine()).intValue();
        System.out.println(hexInt);
    }
}
