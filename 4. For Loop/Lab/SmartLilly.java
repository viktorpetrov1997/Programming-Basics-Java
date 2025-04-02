package ForLoop.Lab;

import java.util.Scanner;

public class SmartLilly
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceOfToy = Integer.parseInt(scanner.nextLine());

        int moneySavedFromBirthdayGifts = 0;
        int moneyForBirthday = 10;
        int numberOfToys = 0;

        for(int i = 1; i <= age; i++)
        {
            if(i % 2 == 0)
            {
                moneySavedFromBirthdayGifts += moneyForBirthday - 1;
                moneyForBirthday += 10;
            }
            else
            {
                ++numberOfToys;
            }
        }

        int moneyEarnedFromSellingToys = numberOfToys * priceOfToy;

        int totalMoneySaved = moneySavedFromBirthdayGifts + moneyEarnedFromSellingToys;

        if(totalMoneySaved >= priceOfWashingMachine)
        {
            System.out.printf("Yes! %.2f", totalMoneySaved - priceOfWashingMachine);
        }
        else
        {
            System.out.printf("No! %.2f", priceOfWashingMachine - totalMoneySaved);
        }
    }
}
