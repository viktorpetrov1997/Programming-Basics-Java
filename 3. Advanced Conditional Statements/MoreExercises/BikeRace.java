package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class BikeRace
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfJuniorCyclists = Integer.parseInt(scanner.nextLine());
        int numberOfSeniorCyclists = Integer.parseInt(scanner.nextLine());
        String trackType = scanner.nextLine();

        double moneyForCharity = 0;

        if(trackType.equals("trail"))
        {
            moneyForCharity = numberOfJuniorCyclists * 5.5 + numberOfSeniorCyclists * 7;
        }
        else if(trackType.equals("cross-country"))
        {
            int numberOfCyclists = numberOfJuniorCyclists + numberOfSeniorCyclists;

            moneyForCharity = numberOfJuniorCyclists * 8 + numberOfSeniorCyclists * 9.5;

            if(numberOfCyclists >= 50)
            {
                moneyForCharity *= 0.75;
            }
        }
        else if(trackType.equals("downhill"))
        {
            moneyForCharity = numberOfJuniorCyclists * 12.25 + numberOfSeniorCyclists * 13.75;
        }
        else if(trackType.equals("road"))
        {
            moneyForCharity = numberOfJuniorCyclists * 20 + numberOfSeniorCyclists * 21.50;
        }

        moneyForCharity *= 0.95;

        System.out.printf("%.2f", moneyForCharity);
    }
}
