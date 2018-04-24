package p19_TheaThePhotographer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheaThePhotographer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long numberOfTakenPictures = Long.parseLong(reader.readLine());
        long filterTimeInSeconds = Long.parseLong(reader.readLine());
        long filterFactor = Long.parseLong(reader.readLine());
        long uploadTime = Long.parseLong(reader.readLine());

        long filterTimeOfAllPictures = numberOfTakenPictures * filterTimeInSeconds;
        long filteredPictures = (long)(Math.ceil(numberOfTakenPictures * filterFactor / 100d));
        long uploadTimeForFilteredPictures = filteredPictures * uploadTime;
        long totalTime = filterTimeOfAllPictures + uploadTimeForFilteredPictures;

        // System.out.println(totalTime);

        long seconds = totalTime % 60;
        totalTime /= 60;
        long minutes = totalTime % 60;
        totalTime /= 60;
        long hours = totalTime % 24;
        totalTime /= 24;
        long days = totalTime;
        System.out.println(String.format("%d:%02d:%02d:%02d", days, hours, minutes, seconds));
    }
}
