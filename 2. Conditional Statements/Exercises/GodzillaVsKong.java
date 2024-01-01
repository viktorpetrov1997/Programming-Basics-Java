package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStatists = Integer.parseInt(scanner.nextLine());
        double priceForClothingForOneStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;

        if(numberOfStatists > 150)
        {
            priceForClothingForOneStatist -= priceForClothingForOneStatist * 0.1;
        }

        double totalPriceForClothing = numberOfStatists * priceForClothingForOneStatist;

        double totalPriceForMovie = totalPriceForClothing + decorPrice;

        if(totalPriceForMovie <= budget)
        {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",budget - totalPriceForMovie);
        }
        else
        {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",totalPriceForMovie - budget);
        }
    }
}
