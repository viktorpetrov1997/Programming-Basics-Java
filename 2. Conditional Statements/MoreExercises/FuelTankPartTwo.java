package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPartTwo
{
    private static final double PRICE_FOR_ONE_LITER_OF_GASOLINE = 2.22;
    private static final double PRICE_FOR_ONE_LITER_OF_DIESEL = 2.33;
    private static final double PRICE_FOR_ONE_LITER_OF_GAS = 0.93;
    private static final double DISCOUNT_FOR_ONE_LITER_OF_GASOLINE = 0.18;
    private static final double DISCOUNT_FOR_ONE_LITER_OF_DIESEL = 0.12;
    private static final double DISCOUNT_FOR_ONE_LITER_OF_GAS = 0.08;
    private static final double SMALL_DISCOUNT = 0.92;
    private static final double BIG_DISCOUNT = 0.90;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double amountOfFuel = Double.parseDouble(scanner.nextLine());
        boolean possessionOfAClubCard = scanner.nextLine().equalsIgnoreCase("yes");

        double pricePerLiter = 0;

        if(typeOfFuel.equals("Gasoline"))
        {
            pricePerLiter = PRICE_FOR_ONE_LITER_OF_GASOLINE;
            if(possessionOfAClubCard)
            {
                pricePerLiter -= DISCOUNT_FOR_ONE_LITER_OF_GASOLINE;
            }
        }
        else if(typeOfFuel.equals("Diesel"))
        {
            pricePerLiter = PRICE_FOR_ONE_LITER_OF_DIESEL;
            if(possessionOfAClubCard)
            {
                pricePerLiter -= DISCOUNT_FOR_ONE_LITER_OF_DIESEL;
            }
        }
        else if(typeOfFuel.equals("Gas"))
        {
            pricePerLiter = PRICE_FOR_ONE_LITER_OF_GAS;
            if(possessionOfAClubCard)
            {
                pricePerLiter -= DISCOUNT_FOR_ONE_LITER_OF_GAS;
            }
        }

        double totalPrice = amountOfFuel * pricePerLiter;

        if(amountOfFuel >= 20 && amountOfFuel <= 25)
        {
            totalPrice *= SMALL_DISCOUNT;
        }
        else if(amountOfFuel > 25)
        {
            totalPrice *= BIG_DISCOUNT;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
