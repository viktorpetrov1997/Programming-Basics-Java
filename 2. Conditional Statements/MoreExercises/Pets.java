package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int foodLeftInKilograms = Integer.parseInt(scanner.nextLine());
        double dogFoodForOneDayInKilograms = Double.parseDouble(scanner.nextLine());
        double catFoodForOneDayInKilograms = Double.parseDouble(scanner.nextLine());
        double turtleFoodForOneDayInGrams = Double.parseDouble(scanner.nextLine());

        double dogFoodNeeded = numberOfDays * dogFoodForOneDayInKilograms;
        double catFoodNeeded = numberOfDays * catFoodForOneDayInKilograms;
        double turtleFoodNeeded = numberOfDays * turtleFoodForOneDayInGrams;

        double turtleFoodNeededInKilograms = turtleFoodNeeded / 1000;

        double totalFoodNeededInKilograms = dogFoodNeeded + catFoodNeeded + turtleFoodNeededInKilograms;

        if(totalFoodNeededInKilograms < foodLeftInKilograms)
        {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftInKilograms - totalFoodNeededInKilograms));
        }
        else
        {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeededInKilograms - foodLeftInKilograms));
        }
    }
}
