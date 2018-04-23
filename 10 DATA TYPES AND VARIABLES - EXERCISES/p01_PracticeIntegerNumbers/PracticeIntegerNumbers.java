package p01_PracticeIntegerNumbers;

import java.math.BigInteger;

public class PracticeIntegerNumbers {
    public static void main(String[] args) {
        byte num1 = -100;
        short num2 = 128;
        short num3 = -3540;
        int num4 = 64876;
        long num5 = 2147483648L;
        long num6 = -1141583228L;
        BigInteger num7 = new BigInteger(String.valueOf("-1223372036854775808"));

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7.toString());
    }
}
