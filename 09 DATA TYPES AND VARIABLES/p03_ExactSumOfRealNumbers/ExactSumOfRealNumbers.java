package p03_ExactSumOfRealNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        BigDecimal sum = new BigDecimal(BigInteger.ZERO);

        while (0 < n--) {
            BigDecimal inputNumber = new BigDecimal(reader.readLine());
            sum = sum.add(inputNumber);
        }
        System.out.println(sum);
    }
}
