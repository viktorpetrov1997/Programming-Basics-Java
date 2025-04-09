package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double priceForKilogramOfVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKilogramOfFruits = Double.parseDouble(scanner.nextLine());
        int totalKilogramsOfVegetables = Integer.parseInt(scanner.nextLine());
        int totalKilogramsOfFruits = Integer.parseInt(scanner.nextLine());

        double totalPriceForVegetables = priceForKilogramOfVegetables * totalKilogramsOfVegetables;
        double totalPriceForFruits = priceForKilogramOfFruits * totalKilogramsOfFruits;

        double totalPriceForFruitsAndVegetablesInBGN = totalPriceForVegetables + totalPriceForFruits;

        double totalPriceForFruitsAndVegetablesInEuros = totalPriceForFruitsAndVegetablesInBGN / 1.94;

        System.out.printf("%.2f", totalPriceForFruitsAndVegetablesInEuros);
    }
}
