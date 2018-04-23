package p16_ComparingFloats;

import java.util.Scanner;

public class ComparingFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float firstNum = Float.parseFloat(scanner.nextLine());
        float secondNum = Float.parseFloat(scanner.nextLine());

        int equal = Float.compare(firstNum,secondNum);
        if (equal == 0){
            System.out.println("False");
        }else if (equal == -1){
            System.out.println("True");
        }
    }
}
