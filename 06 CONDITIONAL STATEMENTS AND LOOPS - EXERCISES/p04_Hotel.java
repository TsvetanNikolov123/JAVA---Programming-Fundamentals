import java.util.Scanner;

public class p04_Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        if (month.equals("May") || month.equals("October")) {
            double discount = 0.0;
            double studioRoom = 50.0;
            double doubleRoom = 65.0;
            double suiteRoom = 75.0;
            double freeNight = 0.0;

            if (nightsCount > 7)    // studio 5%
            {
                discount = nightsCount * studioRoom * 5 / 100.0;
            }

            if (month.equals("October") && nightsCount > 7) {
                freeNight = studioRoom - studioRoom * 5 / 100;
            }

            System.out.printf("Studio: %.2f lv.\n", (studioRoom * nightsCount - discount) - freeNight);
            System.out.printf("Double: %.2f lv.\n", doubleRoom * nightsCount);
            System.out.printf("Suite: %.2f lv.\n", suiteRoom * nightsCount);
        } else if (month.equals("June") || month.equals("September")) {
            double discount = 0.0;
            double studioRoom = 60.0;
            double doubleRoom = 72.0;
            double suiteRoom = 82.0;
            double freeNight = 0.0;

            if (nightsCount > 14)    // studio 10%
            {
                discount = nightsCount * doubleRoom * 10 / 100.0;
            }

            if (month.equals("September") && nightsCount > 7) {
                freeNight = studioRoom; //- studioRoom * 10 / 100.0;
            }

            System.out.printf("Studio: %.2f lv.\n", studioRoom * nightsCount - freeNight);
            System.out.printf("Double: %.2f lv.\n", doubleRoom * nightsCount - discount);
            System.out.printf("Suite: %.2f lv.\n", suiteRoom * nightsCount);
        } else if (month.equals("July") || month.equals("August") || month.equals("December")) {

            double discount = 0.0;
            double studioRoom = 68.0;
            double doubleRoom = 77.0;
            double suiteRoom = 89.0;

            if (nightsCount > 14)    // studio 15%
            {
                discount = nightsCount * suiteRoom * 15 / 100.0;
            }

            System.out.printf("Studio: %.2f lv.\n", studioRoom * nightsCount);
            System.out.printf("Double: %.2f lv.\n", doubleRoom * nightsCount);
            System.out.printf("Suite: %.2f lv.\n", suiteRoom * nightsCount - discount);
        }
    }
}
