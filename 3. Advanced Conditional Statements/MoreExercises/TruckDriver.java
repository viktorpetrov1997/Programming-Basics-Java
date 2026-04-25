package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TruckDriver
{
    private static final int MONTHS_PER_SEASON = 4;
    private static double getPayPerKilometer(double kilometersDrivenPerMonth, String season)
    {
        double amountOfPayPerKilometer = 0;

        if(kilometersDrivenPerMonth <= 5000)
        {
            if(season.equals("Spring") || season.equals("Autumn"))
            {
                amountOfPayPerKilometer = 0.75;
            }
            else if(season.equals("Summer"))
            {
                amountOfPayPerKilometer = 0.9;
            }
            else if(season.equals("Winter"))
            {
                amountOfPayPerKilometer = 1.05;
            }
        }
        else if(kilometersDrivenPerMonth > 5000 && kilometersDrivenPerMonth <= 10000)
        {
            if(season.equals("Spring") || season.equals("Autumn"))
            {
                amountOfPayPerKilometer = 0.95;
            }
            else if(season.equals("Summer"))
            {
                amountOfPayPerKilometer = 1.1;
            }
            else if(season.equals("Winter"))
            {
                amountOfPayPerKilometer = 1.25;
            }
        }
        else if(kilometersDrivenPerMonth > 10000 && kilometersDrivenPerMonth <= 20000)
        {
            amountOfPayPerKilometer = 1.45;
        }

        return amountOfPayPerKilometer;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersDrivenPerMonth = Double.parseDouble(scanner.nextLine());

        double moneyEarned = 0;
        double amountOfPayPerKilometer = getPayPerKilometer(kilometersDrivenPerMonth, season);

        double salary = kilometersDrivenPerMonth * amountOfPayPerKilometer * MONTHS_PER_SEASON * 0.9;

        System.out.printf("%.2f", salary);
    }
}
