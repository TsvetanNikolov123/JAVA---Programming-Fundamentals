package p07_Greeting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String lastName = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        System.out.println(String.format("Hello, %s %s. You are %d years old.",
                firstName,
                lastName,
                age));
    }
}
