package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest
{
    private static final double GRAPES_NEEDED_FOR_ONE_LITER_OF_WINE = 2.5;
    private static final double PERCENTAGE_OF_HARVEST_SET_ASIDE_FOR_WINE_MAKING = 0.40;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int squareMetersOfVineyard = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int litersOfWineNeeded = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = squareMetersOfVineyard * grapesPerSquareMeter;

        double wineProduced = totalGrapes * PERCENTAGE_OF_HARVEST_SET_ASIDE_FOR_WINE_MAKING / GRAPES_NEEDED_FOR_ONE_LITER_OF_WINE;

        if(wineProduced >= litersOfWineNeeded)
        {
            double litersOfWineLeft = wineProduced - litersOfWineNeeded;
            double litersPerWorker = litersOfWineLeft / numberOfWorkers;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(litersOfWineLeft),
                    Math.ceil(litersPerWorker));
        }
        else
        {
            double litersOfWineNeededMore = litersOfWineNeeded - wineProduced;

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersOfWineNeededMore));
        }
    }
}
