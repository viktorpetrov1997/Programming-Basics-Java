package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfPackagesOfPens = Integer.parseInt(scanner.nextLine());
        int numberOfPackagesOfMarkers = Integer.parseInt(scanner.nextLine());
        int litersOfChalkboardCleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceForPens = numberOfPackagesOfPens * 5.8;
        double priceForMarkers = numberOfPackagesOfMarkers * 7.2;
        double priceForChalkboardCleaner = litersOfChalkboardCleaner * 1.2;
        double totalPrice = priceForMarkers + priceForPens + priceForChalkboardCleaner;
        double totalPriceAfterDiscount = totalPrice - (totalPrice * percentDiscount / 100);
        System.out.println(totalPriceAfterDiscount);
    }
}

