import java.util.Scanner;

public class p03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String servicePackage = scanner.nextLine();

        double totalPrice = 0;
        double discount = 0;
        double pricePerPerson = 0;

        if (groupSize <= 50) {
            if (servicePackage.equals("Normal")) {
                totalPrice = 2500 + 500;
                discount = totalPrice - (totalPrice * 5 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Gold")) {
                totalPrice = 2500 + 750;
                discount = totalPrice - (totalPrice * 10 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Platinum")) {
                totalPrice = 2500 + 1000;
                discount = totalPrice - (totalPrice * 15 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Small Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            }
        } else if (groupSize <= 100) {
            if (servicePackage.equals("Normal")) {
                totalPrice = 5000 + 500;
                discount = totalPrice - (totalPrice * 5 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Gold")) {
                totalPrice = 5000 + 750;
                discount = totalPrice - (totalPrice * 10 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Platinum")) {
                totalPrice = 5000 + 1000;
                discount = totalPrice - (totalPrice * 15 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Terrace");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            }
        } else if (groupSize <= 120) {
            if (servicePackage.equals("Normal")) {
                totalPrice = 7500 + 500;
                discount = totalPrice - (totalPrice * 5 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Gold")) {
                totalPrice = 7500 + 750;
                discount = totalPrice - (totalPrice * 10 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            } else if (servicePackage.equals("Platinum")) {
                totalPrice = 7500 + 1000;
                discount = totalPrice - (totalPrice * 15 / 100.0);
                pricePerPerson = discount / groupSize;
                System.out.println("We can offer you the Great Hall");
                System.out.printf("The price per person is %.2f$\n", pricePerPerson);
            }
        } else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}
