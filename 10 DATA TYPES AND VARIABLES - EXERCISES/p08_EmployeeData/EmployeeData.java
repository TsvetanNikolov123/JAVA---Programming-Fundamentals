package p08_EmployeeData;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        byte age = Byte.parseByte(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        long personalId = Long.parseLong(scanner.nextLine());
        int uniqueEmployeeNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("First name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + personalId);
        System.out.println("Unique Employee number: " + uniqueEmployeeNumber);
    }
}
