package p11_ConvertSpeedUnits;

import java.util.Scanner;

public class ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assume 1 mile = 1609 meters.

        double distance = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double minutes = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double hourTime = hours + minutes / 60.0d + seconds / 3600.0d;

        double kmPerHours = (distance / 1000.0d) / hourTime;
        double metersPerSecond = kmPerHours / 3.6d;
        double milesPerHour = (distance / 1609.0d) / hourTime;

        System.out.println(String.format("%f",metersPerSecond));
        System.out.println(String.format("%f",kmPerHours));
        System.out.println(String.format("%f",milesPerHour));
    }
}
