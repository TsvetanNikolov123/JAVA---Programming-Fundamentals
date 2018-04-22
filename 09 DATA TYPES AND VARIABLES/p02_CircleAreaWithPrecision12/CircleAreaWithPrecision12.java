package p02_CircleAreaWithPrecision12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CircleAreaWithPrecision12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigDecimal r = new BigDecimal(reader.readLine());
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal area = pi.multiply(r.multiply(r));

        DecimalFormat df = new DecimalFormat("0.############");
        System.out.printf("%s",df.format(area));
    }
}
