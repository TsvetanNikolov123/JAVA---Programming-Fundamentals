import java.util.Scanner;

public class p03_EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int employeeID = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Employee ID: %08d\n", employeeID);
        System.out.printf("Salary: %.2f", salary);
    }
}
