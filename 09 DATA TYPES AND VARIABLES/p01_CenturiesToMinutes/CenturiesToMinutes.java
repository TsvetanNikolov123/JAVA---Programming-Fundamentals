package p01_CenturiesToMinutes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenturiesToMinutes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Centuries = ");
        int centuries = Integer.parseInt(reader.readLine());
        int years = centuries * 100;
        long days = (long) (years * 365.2422);
        long hours = 24 * days;
        long minutes = 60 * hours;

        System.out.println(String.format("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries, years, days, hours, minutes));
    }
}
