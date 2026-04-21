package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat
{
    private static final int DAYS_IN_A_YEAR = 365;
    private static final int WORKING_DAYS_PLAY_TIME = 63;
    private static final int DAYS_OFF_PLAY_TIME = 127;
    private static final int GAME_NORM = 30000;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfDaysOff = Integer.parseInt(scanner.nextLine());

        int numberOfWorkingDays = DAYS_IN_A_YEAR - numberOfDaysOff;

        int playTime = (numberOfWorkingDays * WORKING_DAYS_PLAY_TIME) + (numberOfDaysOff * DAYS_OFF_PLAY_TIME);

        int difference = Math.abs(GAME_NORM - playTime);

        int hours = difference / 60;
        int minutes = difference % 60;

        if(playTime > GAME_NORM)
        {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
        else
        {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
