import java.util.Scanner;

public class p03_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;
        while (minutes >= 60)
        {
            minutes -= 60;
            hours++;
        }

        while (hours >= 24)
        {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
