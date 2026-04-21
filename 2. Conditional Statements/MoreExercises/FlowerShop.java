package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop
{
    private static final double PRICE_FOR_MAGNOLIAS = 3.25;
    private static final double PRICE_FOR_HYACINTHS = 4;
    private static final double PRICE_FOR_ROSES = 3.5;
    private static final double PRICE_FOR_CACTI = 8;
    private static final double TAXES = 0.05;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOfMagnolias = Integer.parseInt(scanner.nextLine());
        int numberOfHyacinths = Integer.parseInt(scanner.nextLine());
        int numberOfRoses = Integer.parseInt(scanner.nextLine());
        int numberOfCacti = Integer.parseInt(scanner.nextLine());
        double priceForGift = Double.parseDouble(scanner.nextLine());

        double totalProfit = numberOfMagnolias * PRICE_FOR_MAGNOLIAS + numberOfHyacinths * PRICE_FOR_HYACINTHS
                + numberOfRoses * PRICE_FOR_ROSES + numberOfCacti * PRICE_FOR_CACTI;

        double totalProfitAfterTaxes = totalProfit - (totalProfit * TAXES);

        if(totalProfitAfterTaxes >= priceForGift)
        {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalProfitAfterTaxes - priceForGift));
        }
        else
        {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceForGift - totalProfitAfterTaxes));
        }
    }
}
