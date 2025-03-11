package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class Journey
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySpent = 0;
        String destination = "";
        String placeOfStay = "";

        if(budget <= 100)
        {
            if(season.equals("summer"))
            {
                moneySpent = budget * 0.3;
                placeOfStay = "Camp";
            }
            else if(season.equals("winter"))
            {
                moneySpent = budget * 0.7;
                placeOfStay = "Hotel";
            }
            destination = "Somewhere in Bulgaria";
        }
        else if(budget <= 1000)
        {
            if(season.equals("summer"))
            {
                moneySpent = budget * 0.4;
                placeOfStay = "Camp";
            }
            else if(season.equals("winter"))
            {
                moneySpent = budget * 0.8;
                placeOfStay = "Hotel";
            }
            destination = "Somewhere in Balkans";
        }
        else if(budget > 1000)
        {
            moneySpent = budget * 0.9;
            placeOfStay = "Hotel";
            destination = "Somewhere in Europe";
        }

        System.out.println(destination);
        System.out.printf("%s - %.2f", placeOfStay, moneySpent);
    }
}
