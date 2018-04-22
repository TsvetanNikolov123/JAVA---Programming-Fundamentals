package p05_SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            boolean isSpecialNumber = sum == 5 || sum == 7 || sum == 11;

            System.out.println(String.format("%d - > %s", i, isSpecialNumber));
        }
    }
}
