package AdvancedConditionalStatements.Exercises;

import java.util.Scanner;

public class FishingBoat
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if(season.equals("Spring"))
        {
            totalPrice += 3000;
        }
        else if(season.equals("Summer") || season.equals("Autumn"))
        {
            totalPrice += 4200;
        }
        else if(season.equals("Winter"))
        {
            totalPrice += 2600;
        }

        if(numberOfFishermen >= 0 && numberOfFishermen <= 6)
        {
            totalPrice *= 0.9;
        }
        else if(numberOfFishermen >= 7 && numberOfFishermen <= 11)
        {
            totalPrice *= 0.85;
        }
        else if(numberOfFishermen > 12)
        {
            totalPrice *= 0.75;
        }

        if(numberOfFishermen % 2 == 0 && !season.equals("Autumn"))
        {
            totalPrice *= 0.95;
        }

        if(budget >= totalPrice)
        {
            System.out.printf("Yes! You have %.2f leva left.%n", budget - totalPrice);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.%n", totalPrice - budget);
        }
    }
}
