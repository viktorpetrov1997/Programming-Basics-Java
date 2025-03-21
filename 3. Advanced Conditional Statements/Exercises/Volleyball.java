package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class Volleyball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int numberOfHolidays = Integer.parseInt(scanner.nextLine());
        int numberOfWeekendsAtHomeCity = Integer.parseInt(scanner.nextLine());

        final int TOTAL_NUMBER_OF_WEEKENDS = 48;

        int numberOfWeekendsInSofia = TOTAL_NUMBER_OF_WEEKENDS - numberOfWeekendsAtHomeCity;
        double numberOfGamesInSofiaDuringSaturday = numberOfWeekendsInSofia * 0.75;
        double numberOfGamesInSofiaDuringHolidays = numberOfHolidays * (2.0 / 3);

        double totalNumberOfGames = numberOfGamesInSofiaDuringSaturday + numberOfGamesInSofiaDuringHolidays
                + numberOfWeekendsAtHomeCity;

        if(typeOfYear.equals("leap"))
        {
            totalNumberOfGames *= 1.15;
        }

        System.out.println((int) Math.floor(totalNumberOfGames));
    }
}
