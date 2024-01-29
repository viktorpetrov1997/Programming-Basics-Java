package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = durationOfBreak * 0.125;
        double timeForRelaxation = durationOfBreak * 0.25;

        double timeLeft = durationOfBreak - timeForLunch - timeForRelaxation;

        if (timeLeft >= durationOfEpisode)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, Math.ceil(timeLeft - durationOfEpisode));
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, Math.ceil(durationOfEpisode - timeLeft));
        }
    }
}
