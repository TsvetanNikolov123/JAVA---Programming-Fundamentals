package p17_PrintPartOfTheASCIITable;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());

        for (int index = startIndex; index <= endIndex; index++) {
            System.out.print((char) index + " ");
        }
    }
}
