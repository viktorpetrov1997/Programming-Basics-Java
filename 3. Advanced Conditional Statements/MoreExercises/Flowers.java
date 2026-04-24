package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Flowers
{
    private static final int PRICE_FOR_ARRANGING_THE_BOUQUET = 2;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numberOfRoses = Integer.parseInt(scanner.nextLine());
        int numberOfTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isItAHoliday = scanner.nextLine();

        double priceOfBouquet= 0;

        if(season.equals("Spring") || season.equals("Summer"))
        {
            priceOfBouquet = numberOfChrysanthemums * 2 + numberOfRoses * 4.1 + numberOfTulips * 2.5;
        }
        else if(season.equals("Autumn") || season.equals("Winter"))
        {
            priceOfBouquet = numberOfChrysanthemums * 3.75 + numberOfRoses * 4.5 + numberOfTulips * 4.15;
        }

        int numberOfAllFlowers = numberOfChrysanthemums + numberOfRoses + numberOfTulips;

        if(isItAHoliday.equals("Y"))
        {
            priceOfBouquet *= 1.15;
        }

        if(numberOfTulips > 7 && season.equals("Spring"))
        {
            priceOfBouquet *= 0.95;
        }

        if(numberOfRoses >= 10 && season.equals("Winter"))
        {
            priceOfBouquet *= 0.9;
        }

        if(numberOfAllFlowers > 20)
        {
            priceOfBouquet *= 0.8;
        }

        priceOfBouquet += PRICE_FOR_ARRANGING_THE_BOUQUET;

        System.out.printf("%.2f", priceOfBouquet);
    }
}
