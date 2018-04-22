package p04_Elevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peopleToElevate = Integer.parseInt(reader.readLine());
        int elevatorCapacity = Integer.parseInt(reader.readLine());

        if (peopleToElevate % elevatorCapacity == 0){
            int courses = peopleToElevate / elevatorCapacity;
            System.out.println(courses);
        } else {
            int courses = peopleToElevate / elevatorCapacity;
            courses++;
            System.out.println(courses);
        }
    }
}
