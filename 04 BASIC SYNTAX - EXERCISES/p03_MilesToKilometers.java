import java.util.Scanner;

public class p03_MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles = Double.parseDouble(scanner.nextLine());
        double mile = 1.60934;
        double kilometers = mile * miles;

        System.out.printf("%.2f", kilometers);
    }
}
