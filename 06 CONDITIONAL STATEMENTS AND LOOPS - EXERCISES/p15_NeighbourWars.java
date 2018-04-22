import java.util.Scanner;

public class p15_NeighbourWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peshoDmg = Integer.parseInt(scanner.nextLine());
        int goshoDmg = Integer.parseInt(scanner.nextLine());
        int peshoHealth = 100;
        int goshoHealth = 100;
        int counter = 0;

        while (true)            //peshoHealth > 0 || goshoHealth > 0
        {
            counter++;
            if (counter % 2 != 0) // Pesho attacks with “Roundhouse kick” odd turn
            {
                goshoHealth -= peshoDmg;
                if (goshoHealth <= 0) {
                    System.out.printf("Pesho won in %dth round.\n", counter);
                    return;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.\n", goshoHealth);
            } else                   // Gosho attacks with “Thunderous fist” even turn
            {
                peshoHealth -= goshoDmg;
                if (peshoHealth <= 0) {
                    System.out.printf("Gosho won in %dth round.\n", counter);
                    return;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.\n", peshoHealth);
            }

            if (counter % 3 == 0) {
                peshoHealth += 10;
                goshoHealth += 10;
            }
        }
    }
}
