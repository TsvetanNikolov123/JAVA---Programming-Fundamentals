import java.math.BigDecimal;
import java.util.Scanner;

public class p04_BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        int energyContentPer100ml = Integer.parseInt(scanner.nextLine());
        int sugarContentPer100ml = Integer.parseInt(scanner.nextLine());

        BigDecimal totalEnergy = new BigDecimal(String.valueOf(energyContentPer100ml / 100.0 * volume));
        BigDecimal totalSugar = new BigDecimal(String.valueOf(sugarContentPer100ml * volume / 100.0));

        System.out.printf("%dml %s:%n", volume, name);
        System.out.printf("%skcal, %sg sugars%n", customRound(totalEnergy), customRound(totalSugar));
    }

    /**
     * @param number BigDecimal number
     * @return String value of BigDecimal number rounded like C# double (data type) without trailing zeroes
     */
    static String customRound(BigDecimal number) {
        String numberString = number.setScale(12, BigDecimal.ROUND_HALF_UP).toString();
        int index = 15 - numberString.indexOf('.');
        number = new BigDecimal(numberString).setScale(index, BigDecimal.ROUND_HALF_UP)
                .setScale(12, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        double numDouble = Double.parseDouble(number.toString());
        boolean remainder = numDouble % 1 == 0;
        return remainder ? String.format("%.0f", numDouble) : number.toString();
    }
}
