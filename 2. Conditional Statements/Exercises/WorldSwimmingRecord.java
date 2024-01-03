package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForSwimmingOneMeter = Double.parseDouble(scanner.nextLine());

        double timeForEntireSwimWithoutDelay = distanceInMeters * timeForSwimmingOneMeter;

        double delayEvery15Meters = Math.floor((distanceInMeters / 15)) * 12.5;

        double timeForEntireSwimWithDelay = timeForEntireSwimWithoutDelay + delayEvery15Meters;

        if(timeForEntireSwimWithDelay >= recordInSeconds)
        {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForEntireSwimWithDelay - recordInSeconds);
        }
        else
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeForEntireSwimWithDelay);
        }
    }
}