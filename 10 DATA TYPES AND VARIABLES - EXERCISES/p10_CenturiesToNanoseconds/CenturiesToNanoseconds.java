package p10_CenturiesToNanoseconds;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assume that a year has 365.2422 days at average (the Tropical year).

        BigDecimal centuries = new BigDecimal(scanner.nextLine());
        BigDecimal years = new BigDecimal("100").multiply(centuries);
        BigInteger days = new BigDecimal("365.242").multiply(years).toBigInteger();
        BigInteger hours = new BigInteger("24").multiply(days);
        BigInteger minutes = new BigInteger("60").multiply(hours);
        BigInteger seconds = new BigInteger("60").multiply(minutes);
        BigInteger milliseconds = new BigInteger("1000").multiply(seconds);
        BigInteger microseconds = new BigInteger("1000").multiply(milliseconds);
        BigInteger nanoseconds = new BigInteger("1000").multiply(microseconds);

        System.out.println(String.format("%s centuries = %s years = %s days = %s hours " +
                        "= %s minutes = %s seconds = %s milliseconds " +
                        "= %s microseconds = %s nanoseconds",
                centuries,
                years,
                days,
                hours,
                minutes,
                seconds,
                milliseconds,
                microseconds,
                nanoseconds));
    }
}
